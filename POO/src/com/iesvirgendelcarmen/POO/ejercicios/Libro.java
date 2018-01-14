package com.iesvirgendelcarmen.POO.ejercicios;

public class Libro {
	
	private String isbn;
	private String title;
	private String writer;
	private String gender;
	private int totalPages;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	@Override
	public String toString() {
		return "Los datos del Libro introducido son [isbn=" + isbn + ", title=" + title + ", writer=" + writer + ", gender=" + gender
				+ ", totalPages=" + totalPages + "]";
	}
}
