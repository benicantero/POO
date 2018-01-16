package com.iesvirgendelcarmen.POO.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Equation {
	private double a;
	private double b;
	private double c;
	private Object sge;
	
	
	public Equation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	@Override
	public String toString() {
		return "Second grade equation -->  " + a +"x^2 + " + b + "x + " + c + "= 0";
	}

		
	private double getSquareRootOfDiscrminate() {
		return Math.sqrt(b * b - 4 * a * c);
	}
	
	public boolean isSolvable() {
		return ! Double.isNaN(this.getSquareRootOfDiscrminate());
	}
	
	public List<Double> getSolutions(){
		List<Double> solutionList = new ArrayList<>();
		if (getSquareRootOfDiscrminate() == 0)
			solutionList.add(-b / (2 * a));
		else {
			solutionList.add(-b + this.getSquareRootOfDiscrminate() / (2 * a));
			solutionList.add(-b - this.getSquareRootOfDiscrminate() / (2 * a));
		}
		return solutionList;
	}
}
