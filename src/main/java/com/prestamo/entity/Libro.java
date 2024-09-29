package com.prestamo.entity;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "libro")
public class Libro {

	@Id
    private ObjectId _id;

    @Field(name = "title")
    private String title;

    @Field(name = "isbn")
    private String isbn;

    @Field(name = "pageCount")
    private int pageCount;

    @Field(name = "publishedDate")
    private Date publishedDate;

    @Field(name = "thumbnailUrl")
    private String thumbnailUrl;

    @Field(name = "shortDescription")
    private String shortDescription;

    @Field(name = "longDescription")
    private String longDescription;

    @Field(name = "status")
    private String status;

    @Field(name = "authors")
    private List<String> authors;

    @Field(name = "categories")
    private List<String> categories;
}
