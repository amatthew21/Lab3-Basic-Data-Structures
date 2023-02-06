package stack;

import java.util.Stack;

public class Stacks {
	//Task 6: Stacks By Aqua Jacinto
	public static void main(String[] args) {
		Stack<String> stringStack = new Stack<>();
		Stack<Integer> intStack = new Stack<>();
		
		//String Stack
		System.out.println("String Stack Methods:");
		System.out.println("Is this stack of Strings empty?: " + stringStack.isEmpty());
		System.out.println();
		System.out.println("Inserting these quotes into the Stack:");
		//Got to quote my favorite guy from FFXIV
		System.out.println("Quote 1: Tell me, for whom do you fight?");
		System.out.println("Quote 2: Hmph, how very glib.");
		System.out.println("Quote 3: And do you believe in Eorzea?");
		System.out.println();
		stringStack.push("Tell me, for whom do you fight?");
		stringStack.push("Hmph, how very glib.");
		stringStack.push("And do you believe in Eorzea?");
		System.out.println("Is this stack of Strings empty?: " + stringStack.isEmpty());
		
		System.out.println("If we take a peek at the top of the stack, we'll see: " + stringStack.peek());
		System.out.println("If we try to look for the quote 'Hmph, how very glib.', we'll find it in position: " + stringStack.search("Hmph, how very glib.") );
		System.out.println("If we seek to look through the whole stack with pop(), we'll see that it produces: ");
		System.out.println();
		do {
			System.out.println(stringStack.pop());
		} while(!stringStack.isEmpty());
		System.out.println();
		System.out.println("We notice that the output goes the opposite way of our inputs. As a Last in, First out system, it will always go in reverse order to your input.");
		
		System.out.println();
		//Integer Stack
		
		System.out.println("Integer Stack Methods:");
		System.out.println("Is this stack of Integers empty?: " + intStack.isEmpty());
		System.out.println();
		System.out.println("Inserting these numbers into the Stack:");
		System.out.println(5131);
		System.out.println(0413);
		System.out.println(621);
		intStack.push(5131);
		intStack.push(0413);
		intStack.push(621);
		
		System.out.println("Is this stack of Integers empty?: " + intStack.isEmpty());
		
		System.out.println("If we take a peek at the top of the stack, we'll see: " + intStack.peek());
		System.out.println("If we try to look for the number 621, we'll find it in position: " + intStack.search(621) );
		System.out.println("If we seek to look through the whole stack with pop(), we'll see that it produces: ");
		System.out.println();
		do {
			System.out.println(intStack.pop());
		} while(!intStack.isEmpty());
		System.out.println();
		System.out.println("We also notice that the Integer stack has done the same thing as the String stack, with the output going the opposite way.");
	}

}
