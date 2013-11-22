/**
 * @author rahul
 **/
package com.r.neural;

public final class TanhActivationFunction implements ActivationFunction {

	@Override
	public final double calc(double value) {
		return tanh(value);
	}

	@Override
	public final double calcInverse(double value) {
		double tmp = tanh(value);
		return 1.0 - (tmp * tmp);
	}

	private final double tanh(double u) {
		double a = Math.exp(u);
		double b = Math.exp(-u);
		return (a - b) / (a + b);
	}
}
