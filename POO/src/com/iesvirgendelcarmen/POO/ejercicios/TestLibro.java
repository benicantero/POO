package com.iesvirgendelcarmen.POO.ejercicios;

public class TestLibro {

	public static void main(String[] args) {
		Libro bookOne = new Libro();
		System.out.println(bookOne);
		bookOne.setIsbn("9856885478555");
		bookOne.setGender("Adventure");
		bookOne.setTitle("Neverending Story");
		bookOne.setTotalPages(500);
		bookOne.setWriter("Michael Ende");
		System.out.println(bookOne);
	}

}
