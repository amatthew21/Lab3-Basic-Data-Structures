package queue;

import java.util.LinkedList;

public class TestQueue {

	public static void main(String[] args) {
		java.util.Queue<Integer> queue = new LinkedList<>();
		
		System.out.println("Queue Method testing with Integers.");
		
		System.out.println();
		System.out.println("We'll be adding these 5 Integers to the queue (5,132,874,9081,42061)");
		
		queue.add(5);
		queue.add(132);
		queue.add(874);
		queue.add(9081);
		queue.add(42061);
		
		System.out.println("We will also offer an additional number (900) and see if it's been accepted: " + queue.offer(900));
		System.out.println();
		
		System.out.println("If we were to glance at the head of the queue we'll see value: " + queue.element());
		System.out.println("If we then were to go through the queue we will see: ");
		do {
			System.out.println(queue.remove());
		}while(!queue.isEmpty());
		System.out.println();
		System.out.println("If we try to peek at the queue now that it's empty we'll get : " + queue.peek() + " And if we try to poll the queue as well we'll get: " + queue.poll());
		System.out.println();
		System.out.println("We do notice that Add(),Element(), and Remove() will throw an Exception if they can't add onto the queue or there is no element to view/remove.");
		System.out.println("The methods, Offer(),Peek(), and Poll() will instead return a false if an element can't be added onto the queue or null if there is no element to be viewed/removed.");
	}

}
