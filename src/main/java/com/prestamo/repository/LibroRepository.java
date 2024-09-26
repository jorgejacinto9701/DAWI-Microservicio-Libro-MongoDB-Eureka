package com.prestamo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.prestamo.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro, ObjectId>{
	
	
	   @Query("{ 'isbn' : ?0 }")
	   public abstract List<Libro> listaPorIsbn(String id);
	
}
