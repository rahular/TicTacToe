/**
 * @author rahul
 **/
package com.r.genetic;

import java.util.Random;

public class RandomCrossoverFunction implements CrossoverFunction {
	private Random rand = new Random();

	@Override
	public void crossover(boolean[] parent1, boolean[] parent2, boolean[] child) {
		for (int i = 0; i < child.length; i++) {
			child[i] = (rand.nextInt(2) != 0) ? true : false;
		}
	}
}
