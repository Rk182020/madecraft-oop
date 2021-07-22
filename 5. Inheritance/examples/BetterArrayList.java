package examples;

import java.util.ArrayList;

public class BetterArrayList<E> extends ArrayList<E>{

	/**
	 * It is extending Arraylist class and Adding new Functionality  
	 * like Pop last added element from list and print list .
	 */
	private static final long serialVersionUID = 1L;
	
	public static void printList(BetterArrayList<Integer> stack){
		System.out.print("All Elements in stack are - [");
		for (Integer item : stack) {
			System.out.print( " " + item + ",");
		}
		
		System.out.println("]");
		
		
	}
	
	public static void popElement(BetterArrayList<Integer> stack){
		stack.remove(stack.size()-1);
		//System.out.println(stack.size());
	}
}
