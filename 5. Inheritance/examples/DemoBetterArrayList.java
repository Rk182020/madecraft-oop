package examples;

public class DemoBetterArrayList {

	public static void main(String[] args) {
		System.out.println("Hi");
		
		BetterArrayList<Integer> stack = new BetterArrayList<Integer>();
		
		for (int i = 1; i < 10 ; i++) {
			stack.add(i);
		}
		
		BetterArrayList.printList(stack);
		BetterArrayList.popElement(stack);
		BetterArrayList.printList(stack);
		
	}

	

}
