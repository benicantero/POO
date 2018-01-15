package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestMatematicas {

	public static void main(String[] args) {
		
		System.out.println("Type a decimal number: ");
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		in.close();
		Matematicas digit = new Matematicas();
		digit.setData(number);
	
		System.out.println(digit);
		System.out.printf("Square root is %.2f and cubic root is %.2f%n",digit.getSquareRootOfData(),digit.getCubicRootOfAbsoluteData());
		
	}

}
