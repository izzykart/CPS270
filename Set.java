package edu.cmich.cps270;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a set of elements numbered from 0 to 63.  Standard set operations
 * are supported such as adding and removing elements, union, intersection and
 * complement.  
 * 
 * @author [burge1qd, kart1is, tadyc1ja] 
 *
 */
public class Set {	
	
	public static final int MAX_SET_ELEMENT_VALUE = 63;
	ArrayList <Integer> elements;
	
	public Set() {
		elements = new ArrayList<Integer>;
	}
	
	public Set(List<Integer> elements) throws SetElementValueOutOfRange{
		
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get[i] > MAX_SET_ELEMENT_VALUE)
				throw SetElementValueOutOfRange;
		}
		this.elements = elements;
	}
	
	public boolean isInSet(int x) {
		for (int i  = 0; i < elements.size(); i++) {
			if (x == elements[i])
				return true;
		}
		return false;
	}
	
	public void empty() {
		for ( int i = 0; i < elements.size(); i++)
			elements[i] = null;
	}
	
	/**
	 * Adds an element to the set.  
	 * @param x The identifier of the element to add.  Must be in the range of 0 to 63.
	 * @throws SetElementValueOutOfRange
	 */
	public void addElement(int x) throws SetElementValueOutOfRange {
		if (x > MAX_SET_ELEMENT_VALUE)
			throw SetElementValueOutOfRange;
		else
			elements.add(x);
	}
	
	public void removeElement(int x) throws SetElementValueOutOfRange {

		
	}
	
	public Set intersection(Set s) {

		return null;
	}
	
	public Set union(Set s) {

		return null;
	}
	
	public List<Integer> toList() {

		return null;
	}
	
	public boolean isEmpty() {

		return false;
	}

	public int size() {

		return 0;
		
		
	}

	public void complement() {


	}
 }
