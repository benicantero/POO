package com.iesvirgendelcarmen.POO.ejercicios;

public class Cars {
	private double fuelAmount;
	private double consumption;
	
	//obtener cantidad de combustible
	public double getFuel() {
		return fuelAmount;
	}
	//insertar cantidad de combustible
	public void setFuel(int fuel) {
		this.fuelAmount = fuel;
	}
	//obtener consumo
	public double getConsumption() {
		return consumption;
	}
	
	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}
	@Override
	public String toString() {
		return "Car with fuelAmount " + fuelAmount + ",and consumption=" + consumption + "]";
	}
	
	
	//metodo para añadir combustible al deposito
	public void addFuel(double fuel) {
		fuelAmount += fuel;
	}
	
	//conocer la cantidad de kms que puedo recorrer con el combustible que queda
	public double getAutonomy () {
		return 100.0 * fuelAmount / consumption;
	}
}

