package com.flowetc.springstuff.springdata.app;

import com.flowetc.springstuff.springdata.config.DaoConfig;
import com.flowetc.springstuff.springdata.config.PropertiesConfig;
import com.flowetc.springstuff.springdata.dao.CommentDao;
import com.flowetc.springstuff.springdata.dao.TranslationDao;
import com.flowetc.springstuff.springdata.entity.Comment;
import com.flowetc.springstuff.springdata.entity.Translation;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since July 25, 2016
 * @version 1.0
 */
public class TranslationWrite {
    private static final Logger LOGGER = LoggerFactory.getLogger(TranslationWrite.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DaoConfig.class, PropertiesConfig.class)) {
            TranslationDao translationDao = context.getBean(TranslationDao.class);

            Translation welcome = translationDao.findByOriginalString("Welcome");

            if (welcome != null) {
                LOGGER.info(welcome.getTranslatedString());
            } else {
                List<Comment> comments = new ArrayList<>();
                comments.add(Comment.builder()
                        .id(ObjectId.get())
                        .author("Dean Winchester")
                        .text("Awesome")
                        .dateTime(LocalDateTime.now())
                        .build());
                comments.add(Comment.builder()
                        .id(ObjectId.get())
                        .author("Dean Winchester")
                        .text("I want some pie!!!")
                        .dateTime(LocalDateTime.now())
                        .build());

                CommentDao commentDao = context.getBean(CommentDao.class);

                // save the comments
                commentDao.save(comments);

                // save the translation with comments
                translationDao.save(Translation.builder()
                        .id(ObjectId.get())
                        .originalString("Welcome")
                        .translatedString("Welkom")
                        .comments(comments)
                        .build());
            }
        }
    }
}
