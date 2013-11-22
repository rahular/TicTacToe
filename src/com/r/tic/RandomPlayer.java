/**
 * @author rahul
 **/
package com.r.tic;

public class RandomPlayer extends Player {
	public RandomPlayer() {
		// No need to shuffle the free positions.
		setRandomizeMoves(false);
	}

	@Override
	public synchronized int chooseNextMove(char[][] grid, char whichPlayer) {
		setGridAndFindFreeCells(grid);
		int freeIdx = rand.nextInt(freeCount);
		return (freeRow[freeIdx] * 3) + freeCol[freeIdx];
	}
}
