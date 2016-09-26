package springstuff.mongodb.gridfs.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.WriteConcern;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author Philip Mark Gutierrez
 * @since August 30, 2016
 * @version 1.0.0
 */
@Configuration
@EnableMongoRepositories("springstuff.mongodb.gridfs.dao")
public class DaoConfig extends AbstractMongoConfiguration {
    
    @Bean
    public GridFsTemplate gridFsTemplate() throws Exception {
        return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
    }
    
    @Override
    protected String getDatabaseName() {
        return "studentsdb";
    }

    @Override
    public Mongo mongo() throws Exception {
        MongoClient mongo = new MongoClient("localhost", 27018);
        
        return mongo;
    }
}
