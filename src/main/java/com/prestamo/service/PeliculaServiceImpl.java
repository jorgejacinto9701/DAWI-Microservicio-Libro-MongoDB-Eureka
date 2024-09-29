package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Pelicula;
import com.prestamo.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService{
	
	@Autowired
	private PeliculaRepository peliculaRepository;

	@Override
	public List<Pelicula> peliculasPorDirectores(List<String> director) {
		return peliculaRepository.peliculasPorDirectores(director);
	}

	@Override
	public List<Pelicula> peliculasPorAnno(int anno) {
		return peliculaRepository.peliculasPorAnno(anno);
	}
	
	
	
}
