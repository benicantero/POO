package com.iesvirgendelcarmen.POO.ejercicios;

public class Palabra {
	private String data;
	
	//creamos constructor	
	public Palabra(String data) {
		this.data = data;
	}

	//creamos geters, seters y toString no necesarios para este ejercicio

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
		@Override
	public String toString() {
		return "Palabra [data=" + data + "]";
	}

	//método que convierte en mayúsculas
	public String getDataInUpperCase() {
		return data.toUpperCase();
	}

	//metodo que convierte a minusculas
	public String getDataInLowerCase() {
		return data.toLowerCase();
	}
	
	//metodo que devuelva numero de letras
	public int getNumberOfCharacterOfData() {
	return data.length();
	}
	
	//metodo que reemplace letras
	public String changeCharacterInData(char oldCharacter, char newCharacter) {
		return data.replace(oldCharacter, newCharacter);
	}
	
	//metodo que devuelva la primera letra
	public char getFirstCharacter () {
		return data.charAt(0);
	}
	
	//metodo que devuelve la ultima letra
	public char getLastCharacter () {
		return data.charAt(data.length()-1);
	}
}
