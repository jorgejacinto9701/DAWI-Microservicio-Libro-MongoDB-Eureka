package com.prestamo.service;

import java.util.List;

import com.prestamo.entity.Pelicula;

public interface PeliculaService {

	public List<Pelicula> peliculasPorDirectores(List<String> director);
	public List<Pelicula> peliculasPorAnno(int anno);
	
	
}
