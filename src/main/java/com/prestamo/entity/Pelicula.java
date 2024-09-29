package com.prestamo.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;


@Document(collection = "pelicula")
@Getter
@Setter
public class Pelicula {

	 	@Id
	 	private ObjectId _id;
	    private String title;
	    private String plot;
	    private Integer year;
	    @Field(name = "release_date")
	    private String releaseDate;
	    private Integer rank;
	    private Double rating;
	    private List<String> directors;
	    private List<String> genres;
	    private String image;
	    @Field(name = "running_time_secs")
	    private Long runningTimeSecs;
}
