package com.r.genetic;

import java.util.Random;

public class OnePointCrossoverFunction implements CrossoverFunction {
	protected double mutationRate;
	protected Random rand = new Random();

	public OnePointCrossoverFunction(double mutationRate) {
		this.mutationRate = mutationRate;
	}

	public void crossover(boolean[] parent1, boolean[] parent2, boolean[] child) {
		int i, crossoverPoint = rand.nextInt(child.length);
		for (i = 0; i < crossoverPoint; i++) {
			child[i] = parent1[i];
		}
		for (i = crossoverPoint; i < child.length; i++) {
			child[i] = parent2[i];
		}
		for (i = 0; i < child.length; i++) {
			if (rand.nextDouble() < mutationRate) {
				child[i] = !child[i];
			}
		}
	}
}
