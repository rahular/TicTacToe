package com.r.neural;

public interface ActivationFunction {
	public double calc(double value);
	public double calcInverse(double value);
}
