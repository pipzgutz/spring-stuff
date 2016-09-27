package com.flowetc.springstuff.springdata.config;

import com.flowetc.springstuff.springdata.reference.MongoDbProperties;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since July 25, 2016
 */
@EnableMongoRepositories("com.flowetc.springstuff.springdata.dao")
@ComponentScan("com.flowetc.springstuff.springdata.reference")
public class DaoConfig extends AbstractMongoConfiguration {
    @Autowired
    private MongoDbProperties properties;

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), getDatabaseName());
    }

    @Override
    protected String getDatabaseName() {
        return properties.getDatabase();
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(properties.getHost(), properties.getPort());
    }
}
