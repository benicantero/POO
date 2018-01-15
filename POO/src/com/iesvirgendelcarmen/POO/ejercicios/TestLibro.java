package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.List;
import java.util.ArrayList;

public class TestLibro {

	public static void main(String[] args) {
		Libro book1 = new Libro("9788467016901", "El Quijote", "Cervantes", "Ficcion", 500);
		
		Libro book2 = new Libro();
		book2.setIsbn("97884522154");
		book2.setTitle("la Celestina");
		book2.setGender("Poetic");
		book2.setTotalPages(410);
		book2.setWriter("F. Rojas");
		
		List<Libro> bookList = new ArrayList<>(); // creamos una lista de libros
		
		bookList.add(book1);
		bookList.add(book2);
		
		System.out.println(bookList);
		
	}

}
