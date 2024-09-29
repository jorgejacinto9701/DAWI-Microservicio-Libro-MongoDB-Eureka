package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pelicula;
import com.prestamo.service.PeliculaService;

@RestController
@RequestMapping("/url/pelicula")
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	@GetMapping("/peliculasPorDirectores/{director}")
	public List<Pelicula> peliculasPorDirectores(@PathVariable List<String> director) {
		return peliculaService.peliculasPorDirectores(director);
	}
	
	@GetMapping("/peliculasPorAnno/{anno}")
	public List<Pelicula> peliculasPorAnno(@PathVariable int anno) {
		return peliculaService.peliculasPorAnno(anno);
	}
}
