package com.prestamo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.prestamo.entity.Pelicula;

public interface PeliculaRepository extends MongoRepository<Pelicula, ObjectId>{

	
	@Query("{ 'directors' : { $in: ?0 } }")
	public List<Pelicula> peliculasPorDirectores(List<String> director);
	
	@Query("{ 'year' :  ?0  }")
	public List<Pelicula> peliculasPorAnno(int anno);
}
