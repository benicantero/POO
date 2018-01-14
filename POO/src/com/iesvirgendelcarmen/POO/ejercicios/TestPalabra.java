package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		
		Palabra palabra1 = new Palabra(null);
		System.out.println("Type your word");
		Scanner in = new Scanner(System.in);
		palabra1.setPalabra(in.next());
		in.close();
		System.out.println(palabra1);
		//System.out.println(toUpperCase(palabra1));
		//Palabra palabra2 = new Palabra();
		//palabra2 = toUpperCase(String palabra1) {
		}
}
