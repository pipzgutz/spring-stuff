package com.flowetc.springstuff.springdata.entity;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @author Philip Mark Gutierrez <pgutierrez@owens.com>
 * @since July 25, 2016
 * @version 1.0
 */
@Data
@Builder
@Document
public class Translation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId id;
    @Indexed
    private String originalString;
    private String translatedString;
    @DBRef
    private List<Comment> comments;
}
