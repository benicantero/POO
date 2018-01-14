package com.iesvirgendelcarmen.POO.ejercicios;

public class Palabra {
	private String palabra;

	//creamos el constructor 
	public Palabra (String palabra) {
		this.palabra = palabra;
	}
	
	//creamos geters, seters y toString
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public String toString() {
		return "Palabra [palabra=" + palabra + "]";
	}
	
	
	
	//m�todo que convierte en may�sculas
	public String toUpperCase() {
		return palabra.toUpperCase();
	}
	
	
	
}
