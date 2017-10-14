package com.a2cart.models;

public class NumberPojo {

	public Double a;

	public Double b;

	public NumberPojo() {
	}

	public NumberPojo(Double a, Double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "NumberPojo [a=" + a + ", b=" + b + "]";
	}

}
