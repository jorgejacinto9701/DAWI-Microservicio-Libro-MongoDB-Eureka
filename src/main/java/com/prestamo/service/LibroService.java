package com.prestamo.service;

import java.util.List;

import com.prestamo.entity.Libro;

public interface LibroService {

	public abstract List<Libro> findAll();
	public abstract List<Libro> listaPorIsbn(String isbn);
	public abstract List<Libro> listaPorCategories(List<String> categories);
	public abstract List<Libro> listaPorShortDescriptionLike(String shortDescription);
}
