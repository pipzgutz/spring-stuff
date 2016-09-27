package com.flowetc.springstuff.springdata.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since July 25, 2016
 * @version 1.0
 */
@Data
@Builder
@Document
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private ObjectId id;
    @Indexed
    private String author;
    private String text;
    private LocalDateTime dateTime;
}
