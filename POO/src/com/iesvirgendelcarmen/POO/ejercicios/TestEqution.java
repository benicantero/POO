package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestEqution {

	public static void main(String[] args) {
		
		System.out.println("Type de values of a, b, and c of de cuadratic equation: ");
		Scanner sc = new Scanner (System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
	
		Equation sqe = new Equation(a, b, c);
		if (sqe.isSolvable()) {
			for (Double d : sqe.getSolutions()) {
				System.out.printf("Solution %.2f%n", d);
			}
		}else System.out.println("This equation is irresolvable");
	}
}
