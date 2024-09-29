package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Libro;
import com.prestamo.service.LibroService;

@RestController
@RequestMapping("/url/libro")
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	
	@GetMapping("/listar")
	public List<Libro> listar() {
		return libroService.findAll();
	}
	
	@GetMapping("/listarPorIsbn/{isbn}")
	public List<Libro> listarPorIsbn(@PathVariable String isbn) {
		return libroService.listaPorIsbn(isbn);
	}
	
	@GetMapping("/listarPorCategories/{categories}")
	public List<Libro> listarPorCategories(@PathVariable List<String> categories) {
		return libroService.listaPorCategories(categories);
	}
	
	@GetMapping("/listarPorShortDescriptionLike/{shortDescription}")
	public List<Libro> listarPorShortDescriptionLike(@PathVariable String shortDescription) {
		return libroService.listaPorShortDescriptionLike(shortDescription);
	}
}


