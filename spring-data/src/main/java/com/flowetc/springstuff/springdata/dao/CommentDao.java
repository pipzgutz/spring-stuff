package com.flowetc.springstuff.springdata.dao;

import com.flowetc.springstuff.springdata.entity.Comment;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since August 30, 2016
 */
public interface CommentDao extends MongoRepository<Comment, ObjectId> {
}
