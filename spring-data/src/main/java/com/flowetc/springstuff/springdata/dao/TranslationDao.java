package com.flowetc.springstuff.springdata.dao;

import com.flowetc.springstuff.springdata.entity.Translation;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since July 25, 2016
 */
public interface TranslationDao extends MongoRepository<Translation, ObjectId>,
        QueryDslPredicateExecutor<Translation> {

    Translation findByOriginalString(String originalString);

    void deleteByOriginalString(String originalString);
}
