package de.hftstuttgart.simplecalc;

import java.io.Serializable;

public class Calculator implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3371922047637077075L;

	public int add(int x, int y) {
		int result;
		result = x + y;
		return result;
	}

}
