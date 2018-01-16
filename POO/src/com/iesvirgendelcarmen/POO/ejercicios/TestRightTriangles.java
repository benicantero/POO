package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestRightTriangles {

	public static void main(String[] args) {
		System.out.println("Type values side");
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		sc.close();
		
		Triangle rt = new Triangle (side1 , side2);
		System.out.println(rt);
		System.out.printf("Side one %.2f, side two %.2f, hypotenuse = %.2f, area = %.2f, perimeter = %.2f%n  ",side1, side2, rt.getHypotenuse(), rt.getArea(), rt.getPerimeter());
	}

}
