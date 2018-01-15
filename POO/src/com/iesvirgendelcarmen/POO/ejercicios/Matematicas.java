package com.iesvirgendelcarmen.POO.ejercicios;

import static java.lang.Math.*; // poniendo esto podemos omitir poner la clase Math cada vez que la llamemos con algun metodo estatico

public class Matematicas {
	private double data;

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Matematicas [data=" + data + "]";
	}

	//método para obtener la raiz cuadrada
	public double getSquareRootOfData () {
		return sqrt(data);
	}
	
	//metodo para obtener la raíz cubica
	public double getCubicRootOfAbsoluteData () {
		return cbrt(abs(data));
	}
	
	//metodo que redondee el numero de tipo doble a entero
	public int getRoundAbsoluteData() {
		return (int) round(abs(data));
	}
	
	//metodo que devuelva un número aleatorio en el intervalo de 0 al numero de la clase redondeado
	public int getARandomNumberOfZeroToRoundData() {
		/*int number = getRoundAbsoluteData();
		int randomNumber = (int) (Math.random() * (number + 1));
		return randomNumber;*/
		return (int) (random() * (getRoundAbsoluteData() + 1));
	}
	
	
}

