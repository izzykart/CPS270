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
	private long set;
	
	public Set() {
		set = 0;
	}
	
	public Set(List<Integer> elements) throws SetElementValueOutOfRange{
		set = 0;
		for(int i = 0; i < elements.size(); i++) {
			set.addElement(elements.get(i));
		}
	}
	
	public boolean isInSet(int x) {
		long mask = 1;
		mask << x;
		if (set & mask != 0)
			return true;
		else
			return false
	}
	
	public void empty() {
		
	}
	
	/**
	 * Adds an element to the set.  
	 * @param x The identifier of the element to add.  Must be in the range of 0 to 63.
	 * @throws SetElementValueOutOfRange
	 */
	public void addElement(int x) throws SetElementValueOutOfRange {
		long mask = 1;
		if (x > MAX_SET_ELEMENT_VALUE)
			throw SetElementValueOutOfRange;
		else {
			mask << x;
			set = (set | mask);
		}
	}
	
	public void removeElement(int x) throws SetElementValueOutOfRange {
		long mask = 1;
		if (x > MAX_SET_ELEMENT_VALUE)
			throw SetElementValueOutOfRange;
		else {
			mask << x;
			set = (set & ~mask);
		}
	}
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
		if(set = 0)
			return true;
		else
			return false;
	}

	public int size() {
		int size = 0;
		String s = Long.toBinaryString(set);
		
		for (int i = 63; i != 1; i--) {
			if (s.charAt(i) == '1')
				size++;
		}
		
		return size;
		
		
	}

	public void complement() {
		set  = 	~set;
	}
 }
