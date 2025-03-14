package com.total.anac.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Sample implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String color;
	private double temperature;
	private int measUp;
	private int compUp;

	public Sample() {
	}

	public java.lang.String getColor() {
		return this.color;
	}

	public void setColor(java.lang.String color) {
		this.color = color;
	}

	public double getTemperature() {
		return this.temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public int getMeasUp() {
		return this.measUp;
	}

	public void setMeasUp(int measUp) {
		this.measUp = measUp;
	}

	public int getCompUp() {
		return this.compUp;
	}

	public void setCompUp(int compUp) {
		this.compUp = compUp;
	}

	public Sample(java.lang.String color, double temperature, int measUp,
			int compUp) {
		this.color = color;
		this.temperature = temperature;
		this.measUp = measUp;
		this.compUp = compUp;
	}
	
	@Override
	public String toString() {
		return "Sample [color=" + color + ", temperature=" + temperature + ", measUp=" + measUp + ", compUp=" + compUp
				+ "]";
	}
	
	public void addComment(int code) {
		System.out.println("the rule number " + code + " has been executed ");
	}

}