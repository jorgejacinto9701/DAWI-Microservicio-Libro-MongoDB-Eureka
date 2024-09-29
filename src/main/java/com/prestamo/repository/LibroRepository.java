package com.prestamo.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.prestamo.entity.Libro;

public interface LibroRepository  extends MongoRepository<Libro, ObjectId>{

	
	@Query("{ 'isbn' : ?0 }")
	public List<Libro> listaPorIsbn(String isbn);
	
	@Query("{ 'categories' : { $in: ?0 } }")
	public List<Libro> listaPorCategories(List<String> categories);
	
	@Query("{ 'shortDescription' : { $regex: ?0 } }")
	public List<Libro> listaPorShortDescriptionLike(String shortDescription);
}
