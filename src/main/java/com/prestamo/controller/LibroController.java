package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Libro;
import com.prestamo.service.LibroService;

@RestController
@RequestMapping("/url/libro")
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@GetMapping("/lista")
	public List<Libro> listaLibro() {
		return libroService.listaLibro();
	}
	
	@GetMapping("/listaPorIsbn/{id}")
	public List<Libro> listaPorIsbn(String id) {
		return libroService.listaLibroPorIsbn(id);
	}
	
	
}


