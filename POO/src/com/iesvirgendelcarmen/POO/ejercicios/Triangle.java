package com.iesvirgendelcarmen.POO.ejercicios;

/**
 * Managed class for right triangle
 * @author beni
 * @version 1.0
 */

public class Triangle {
	private double side1;
	private double side2;
		
/**
 * Contructor
 * @param side1 first cateto
 * @param side2 second cateto
 */
	public Triangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}

/**
 * 
 * @return hypotenuse value of figth triangle, type double
 */
	public double getHypotenuse() {
		return Math.pow(side1, 2) + Math.pow(side2, 2);
	}
/**
 * 		
 * @return area value of figth triangle, type double
 */
	public double getArea() {
		return side1 * side2 / 2.0;
	}
	/**
	 * 
	 * @return perimeter value of figth triangle, type double
	 */
		
	public double getPerimeter() {
		return side1 + side2 + getHypotenuse();
	}

	
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", Hypotenuse=" + (Math.round(getHypotenuse()*100) / 100) + "]";
	}
	
	
}
