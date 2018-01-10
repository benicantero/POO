package com.iesvirgendelcarmen.POO.teoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		System.out.println("Set height and width of the rectangle");
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		int height = in.nextInt();
		in.close();
		
		//Creamos un objeto rectangulo
		Rectangle rectangle1 = new Rectangle ();
		
		//inicializamos los atributos
		rectangle1.setHeight(height);
		rectangle1.setWidth(width);
		
		//calculamos datos del rectángulo
		int area = rectangle1.getArea();
		int perimeter = rectangle1.getPerimeter(); 
		
		//Mostrar datops del rectangulo
		System.out.printf("The rectangle with height %d and width %d is %d and permiter value is %d %n%n",rectangle1.getHeight(),rectangle1.getWidth(), area, perimeter);

		//System.out.println(rectangle1); //llamamos a toString()
		
		//creamos dos nuevos objetos Rectangulo
		
		Rectangle rectangle2 = new Rectangle();
		Rectangle rectangle3 = new Rectangle();
		
		rectangle2.setHeight(50);
		rectangle2.setWidth(20);
		rectangle3.setHeight(15);
		rectangle3.setWidth(10);
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(rectangle3);
		
		//creamos dos colecciones de rectángulos array y arraylist
		//array
		
		Rectangle[] arrayRectangles = new Rectangle [3];
		arrayRectangles[0] = rectangle1;
		arrayRectangles[1] = rectangle2;
		arrayRectangles[2] = rectangle3;
		
		//araylist
		
		ArrayList<Rectangle> rectangleList = new ArrayList<>(); //creamos una lista de tamaño 0
		rectangleList.add(rectangle3);
		rectangleList.add(rectangle2);
		rectangleList.add(rectangle1);
		//imprimimos las listas
		
		System.out.println(Arrays.toString(arrayRectangles));
		System.out.println(rectangleList);
		
		//Llamamos a los metodos
		System.out.printf("Average area is %f%n", getAverageAreas(arrayRectangles));
		System.out.printf("Average perimeter is %f%n", getAveragePerimeters(rectangleList));
		System.out.printf("Greater rectangle is %s%n", getGreaterArea(rectangleList));
	}
	//metodo que pasamos una coleccion de objetos Rectágulos y nos devuelva el valor medio de las áreas
	
	public static double getAverageAreas(Rectangle[] arrayRectangles) {
		double sum = 0;
		for (Rectangle rectangle : arrayRectangles) {
			sum += rectangle.getArea();
		}
		return sum / arrayRectangles.length;
	}
	//tarea para casa
	//metodo que pasamos una coleccion (arrayList) de objetos Rectágulo y nos devuelva el valor medio de los perimetros
	public static double getAveragePerimeters(ArrayList<Rectangle> rectangleList) {
		double sum = 0;
		for (Rectangle rectangle : rectangleList) {
			sum += rectangle.getPerimeter();
		}
		return sum / rectangleList.size();
	}
	
	//metodo que nos devuelva un OBJETO RECTANGLE que tenga la mayor area.
	public static Rectangle getGreaterArea(ArrayList<Rectangle> rectangleList) {
		Rectangle greaterRectangle = rectangleList.get(0);
		int greaterArea = rectangleList.get(0).getArea();
		for (int i = 1; i < rectangleList.size(); i++) {
			if (rectangleList.get(i).getArea() > greaterArea) {
				greaterRectangle = rectangleList.get(i);
				greaterArea = rectangleList.get(i).getArea();
			}
		}
		
		return greaterRectangle;
		
	}
}
