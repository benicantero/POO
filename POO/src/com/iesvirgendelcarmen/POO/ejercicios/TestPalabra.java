package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.Scanner;

public class TestPalabra {

	public static void main(String[] args) {
		
		System.out.println("Type a word");
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		sc.close();
		Palabra word = new Palabra(data);
		System.out.println(word);
		System.out.printf("Your word in capital letters is %s and your lowercase word is %s%n",word.getDataInUpperCase(),word.getDataInLowerCase());
		System.out.printf("Number of characters of your word is %d%n",word.getNumberOfCharacterOfData());
		char oldChar = 'o';
		char newChar = 'u';
		System.out.printf("Change character %c by %c your word is %s%n", oldChar, newChar, word.changeCharacterInData(oldChar, newChar));
		System.out.printf("Firt character of de word %s is %c and last character %c%n",word, word.getFirstCharacter(),word.getLastCharacter());
	}
}
