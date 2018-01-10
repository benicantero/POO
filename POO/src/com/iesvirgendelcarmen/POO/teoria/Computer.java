package com.iesvirgendelcarmen.POO.teoria;

public class Computer {

	private int code;
	private String brand;
	private String color;
	private boolean owner;
	
	public Computer() {}

	public Computer(int code, String brand, String color, boolean owner) {
		this.code = code;
		this.brand = brand;
		this.color = color;
		this.owner = owner;
	}

	public Computer(int code, String brand, boolean owner) {
		this.code = code;
		this.brand = brand;
		this.owner = owner;
		this.color = "black";
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOwner() {
		return owner;
	}

	public void setOwner(boolean owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Computer [code=" + code + ", brand=" + brand + ", color=" + color + ", owner=" + owner + "]";
	}
	
	public static void main(String[] args) {
		Computer computer1 = new Computer();
		computer1.setCode(0);
		computer1.setBrand("APD");
		computer1.setColor("Red");
		computer1.setOwner(false);
		Computer computer2 = new Computer(1, "Hiditec", "White", true);
		Computer computer3 = new Computer(2, "PF", true);
		System.out.println(computer1 + "\n" + computer2 + "\n" + computer3);
	}
}
