package com.iesvirgendelcarmen.POO.ejercicios;

public class TestCar {

	public static void main(String[] args) {
		Cars carOne = new Cars();
		System.out.println(carOne);
		carOne.addFuel(5);
		carOne.setConsumption(5);
		System.out.printf("Autonomy %.2f km%n", carOne.getAutonomy());
		
	}

}
