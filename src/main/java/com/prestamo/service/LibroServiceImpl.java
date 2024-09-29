package com.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestamo.entity.Libro;
import com.prestamo.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroRepository;
	
	@Override
	public List<Libro> findAll() {
		return libroRepository.findAll();
	}

	@Override
	public List<Libro> listaPorIsbn(String isbn) {
		return libroRepository.listaPorIsbn(isbn);
	}

	@Override
	public List<Libro> listaPorCategories(List<String> categories) {
		return libroRepository.listaPorCategories(categories);
	}

	@Override
	public List<Libro> listaPorShortDescriptionLike(String shortDescription) {
		return libroRepository.listaPorShortDescriptionLike(shortDescription);
	}

}


