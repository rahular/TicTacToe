/**
 * @author rahul
 **/
package com.r.genetic;

public class IncrementCrossoverFunction implements CrossoverFunction {
	private boolean[] bits;

	public IncrementCrossoverFunction(int numBits) {
		this.bits = new boolean[numBits];
	}

	@Override
	public void crossover(boolean[] parent1, boolean[] parent2, boolean[] child) {
		System.arraycopy(bits, 0, child, 0, bits.length);
		for (int i = bits.length - 1; i >= 0; i--) {
			bits[i] = !bits[i];
			if (bits[i])
				break;
		}
	}
}
