	package com.prestamo.service;
	
	import java.util.List;
	
	import com.prestamo.entity.Libro;
	
	public interface LibroService {
	
		public List<Libro> listaLibro();
		public List<Libro> listaLibroPorIsbn(String isbn);
		
	}
