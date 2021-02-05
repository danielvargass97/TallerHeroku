package edu.escuelaing.arep.calculator;

import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Node;

/**
 * 
 * @author Daniel
 *
 */
public class StandardDeviation {
	
	private double result;
	
	/**
	 * Creator of the standard deviation class, set the variable "result" to zero.
	 */
	public StandardDeviation() {
		result = 0;
	}
	
	/**
	 * Method that calculates the standard deviation of the data in a list.
	 * @param list (LinkedList of nodes) 
	 */
	public void calculateStandardDeviation(LinkedList<Node> list) {
		double N = list.getSize();
		Node aux = list.getHead();
		Mean mean = new Mean();
		mean.calculateMean(list);
		double resultMean = mean.getResult();
		double accumulator = 0;
		for (int i = 0; i<N; i++) {
			accumulator += Math.pow(aux.getValue() - resultMean, 2);
			aux = aux.getNext();
		}
		result = Math.sqrt(accumulator/ (N-1));
	}
	
	/**
	 * Method that returns a rational number that is the standard deviation.
	 * @return result
	 */
	public double getResult() {
		return result;
	}
}
