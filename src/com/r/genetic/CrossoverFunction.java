/**
 * @author rahul
 **/
package com.r.genetic;

public interface CrossoverFunction {
	public void crossover(boolean[] parent1, boolean[] parent2, boolean[] child);
}
