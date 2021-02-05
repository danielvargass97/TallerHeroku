package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.linkedList.*;

/**
 * 
 * @author Daniel
 *
 */
public class Mean {
	
	private double result;
	private double N;
	
	/**
	 * Creator of the statistical mean class, set the variable "result" to zero.
	 */
	public Mean() {
		result = 0;
	}
	
	/**
	 * Method that calculates the statistical mean of the data in a list.
	 * @param list (LinkedList of nodes)
	 */
	public void calculateMean(LinkedList<Node> list) {
		N = list.getSize();
		Node aux = list.getHead();
		double accumulator = 0;
		for (int i=0; i<N; i++) {
			accumulator += aux.getValue();	
			aux = aux.getNext();
		}
		result = accumulator / N;	
	}
	
	/**
	 * Method that returns a rational number that is the statistical mean.
	 * @return result
	 */
	public double getResult() {
		return result;
	}
}
