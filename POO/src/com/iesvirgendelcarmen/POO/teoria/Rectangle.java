package com.iesvirgendelcarmen.POO.teoria;

public class Rectangle {
	//atributos o variables de instancia
	private int height;
	private int width;
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getArea() {
		
		return width * height;
	}
	
	public int getPerimeter() {
		return (width + height) * 2;
	}

	@Override  //lo sobreescribe porque lo hereda de la clase padre Object
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}
	
	
}

