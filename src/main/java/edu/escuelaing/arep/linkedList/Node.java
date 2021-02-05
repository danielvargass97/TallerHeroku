package edu.escuelaing.arep.linkedList;

/**
 * 
 * @author Daniel
 *
 */
public class Node {
	
	private double value;
	private Node next;
	private Node previous;
	
	/**
	 * Creator of the Node class. The value must be entered 
	 * as a parameter. Set the variable "next" as null.
	 * @param double value (value to node)
	 */
	public Node(double value){
		this.value = value;
		next = null;
	}
	
	/**
	 * Get method that returns the value of a node.
	 * @return double (Value of the node)
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * Set method that assigns the value of a node.
	 * @param double value (value to set)
	 */
	public void setValue(double value) {
		this.value = value;
	}
	
	/**
	 * Get method that returns the next node.
	 * @return Node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * Set method that assigns a reference to next node.
	 * @param Node next (node next)
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * Set method that assigns a reference to previous node.
	 * @return Node previous (Node previous is returned)
	 */
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	/**
	 * Get method that returns the previous node.
	 * @return Node
	 */
	public Node getPrevious() {
		return previous;
	}
}
