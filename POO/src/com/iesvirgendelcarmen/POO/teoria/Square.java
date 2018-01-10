package com.iesvirgendelcarmen.POO.teoria;

public class Square {
	private int size;

	
	public Square() {
		this.size = 5;
	}
	
	public Square(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Square [size=" + size + "]";
	}
	
}
