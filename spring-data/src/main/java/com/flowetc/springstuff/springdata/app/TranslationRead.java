package com.flowetc.springstuff.springdata.app;

import com.flowetc.springstuff.springdata.config.DaoConfig;
import com.flowetc.springstuff.springdata.config.PropertiesConfig;
import com.flowetc.springstuff.springdata.dao.TranslationDao;
import com.flowetc.springstuff.springdata.entity.QTranslation;
import com.flowetc.springstuff.springdata.entity.Translation;
import com.querydsl.core.types.Predicate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @version 1.0
 * @since August 31, 2016
 */
public class TranslationRead {
    public static final Logger LOG = LoggerFactory.getLogger(TranslationRead.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(DaoConfig.class, PropertiesConfig.class)) {
            TranslationDao translationDao = context.getBean(TranslationDao.class);

            QTranslation qTranslation = QTranslation.translation;

            Predicate predicate = qTranslation.originalString.contains("elcom");
            Iterable<Translation> result = translationDao.findAll(predicate);

            for (Translation trans : result) {
                LOG.info("Translated String: " + trans.getTranslatedString());
            }
        }
    }
}
