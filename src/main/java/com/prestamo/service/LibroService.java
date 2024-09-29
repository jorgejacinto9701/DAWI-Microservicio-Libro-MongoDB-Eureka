package com.prestamo.service;

import java.util.List;

import com.prestamo.entity.Libro;

public interface LibroService {

	
	public abstract List<Libro> findAll();
	public abstract Libro listaPorIsbn(String isbn);
	
}
