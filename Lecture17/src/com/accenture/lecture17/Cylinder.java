package com.accenture.lecture17;

public class Cylinder extends Circle {

	private double heigth;

	Cylinder(double radius, double heigth, String color) {
		super(radius, color);
		this.heigth = heigth;

	}

	public double getHeigth() {
		return heigth;
	}

	public double getCylinderArea() {
	
	
	//public double getArea() {
		
		return super.getArea()*2 + super.getArea()*heigth;
	}
	
		
		public String toString() {
			return "The " + color + " cylinder with radius " + radius + " and heigth " + heigth + " It' s area is " + getCylinderArea();
		}
	}

