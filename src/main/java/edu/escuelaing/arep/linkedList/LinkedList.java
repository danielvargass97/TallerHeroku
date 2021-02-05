package edu.escuelaing.arep.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 
 * @author Daniel
 */

@SuppressWarnings("rawtypes")
public class LinkedList<T> implements List {
	
	private Node head;
	private Node tail;
	private Node temp;
	private double size;
	
	/**
	 * Creator of the LinkedList class, it sets 
	 * the variable "size" at zero and the variables 
	 * "head" and "tail" at null.
	 */
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	/**
	 * Method that adds a value to the list. It is 
	 * added to the beginning of the list. It was 
	 * implemented as a stack
	 * @param value double (value to insert)
	 */
	public void add(double value) {
		if (head == null) {
			temp = new Node(value);
			temp.setNext(tail);
			temp.setPrevious(head);
			this.head = temp;
			this.tail = temp;
			size++;
		}
		else {
			temp = new Node(value);
			temp.setNext(head);
			temp.setPrevious(head.getPrevious());
			head.setPrevious(temp);
			this.head = temp;
			size++;
		}
	}
	
	/**
	 * Method that removes a value from the 
	 * list. In case of repeated values, the 
	 * first value found will be eliminated.
	 * @param value double (value to delete)
	 */
	public void remove(double value) {
		Node aux = head;
		for (int i=0; i<size; i++) {
			if(value == aux.getValue()) {
				if (aux.getNext() == null) {
					aux.getPrevious().setNext(aux.getNext());
					tail = aux.getPrevious();
					size--;
					break;
				}
				else if(aux.getPrevious() == null){
					aux.getNext().setPrevious(aux.getPrevious());
					head = aux.getNext();
					size--;
					break;
				}
				else {
					aux.getNext().setPrevious(aux.getPrevious());
					aux.getPrevious().setNext(aux.getNext());
					size--;
					break;
					}
				}
			else {
				if (i != size ) {
					aux = aux.getNext();
				}
			}
		}
	}
	
	/**
	 * Get method that return the value of tail of the list
	 * @return double
	 */
	public double getValueTail() {
		return tail.getValue();
	}
	
	/**
	 * Get method that return the value of head of the list
	 * @return double
	 */
	public double getValueHead() {
		return head.getValue();
	}
	
	/**
	 * Get method that return head of the list
	 * @return Node
	 */
	public Node getHead() {
		return head;
	}
	
	/**
	 * Get method that return tail of the list
	 * @return Node
	 */
	public Node getTail() {
		return tail;
	}
	
	/**
	 * Get method that size of the list
	 * @return Integer
	 */
	public double getSize() {
		return size;
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return false;
	}

	@Override
	public boolean contains(Object o) {
		return false;
	}

	@Override
	public Iterator<T> iterator() { 

		Iterator<T> iterator;
        iterator =  new Iterator<T>() {
            Node aux = head;
            @Override
            public boolean hasNext() {
                if(aux == null){
                    return false;
                }
                else{
                    return true;
                }
            }

            @Override
            public T next() {
                @SuppressWarnings("unchecked")
				T value = (T) aux.getNext();
                aux = aux.getNext();
                return value;
            }
        };
        return iterator;
    }

	public Object[] toArray() {
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		return null;
	}

	@Override
	public boolean add(Object e) {
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return false;
	}
	
	@Override
	public boolean containsAll(Collection c) {
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		return false;
	}

	@Override
	public void clear() {
	}

	@Override
	public Object get(int index) {
		return null;
	}

	@Override
	public Object set(int index, Object element) {
		return null;
	}

	@Override
	public void add(int index, Object element) {
	}

	@Override
	public Object remove(int index) {
		return null;
	}

	@Override
	public int indexOf(Object o) {
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		return 0;
	}

	@Override
	public ListIterator listIterator() {
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		return null;
	}
}



