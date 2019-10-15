package clgpractice;
import java.util.Scanner;
import java.util.*;

public class experiment2a {

	public static void main(String[] args) {
		int choose;
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		Queue<Integer> q = new PriorityQueue<Integer>();
		System.out.println("What do you want to implement?");
		System.out.println("1. Stack");
		System.out.println("2. Queue");
		choose = sc.nextInt();
		switch(choose) {
			case 1:{
				System.out.println("Is Stack Empty? "+ s.isEmpty());
				s.push(10);
				s.push(20);
				s.push(30);
				s.push(40);
				s.push(50);
				s.push(60);
				System.out.println("Contents Stack is: " + s);
				System.out.println("Size of Stack is: " + s.size());
				s.pop();
				s.pop();
				System.out.println("Elements are popped.");
				System.out.println("Contents Stack is: " + s);
				System.out.println("Size of Stack is: " + s.size());
				System.out.println("On peeking Stack: " + s.peek());
				System.out.println("Is Stack Empty?"+ s.isEmpty());
				System.out.println("Searching for 30: "+ s.search(30));
				System.out.println("Searching for 60: "+ s.search(60));
				break;
			}
			case 2:{
				System.out.println("Is Queue Empty?"+ q.isEmpty());
				q.add(10);
				q.add(20);
				q.add(30);
				q.add(40);
				q.add(50);
				System.out.println("Contents Queue is: " + q);
				System.out.println("Size of Queue is: " + q.size());
				q.remove();
				q.poll(); //removes element , if queue is empty returns null
				System.out.println("Elements are removed.");
				System.out.println("Contents Queue is: " + q);
				System.out.println("Size of Queue is: " + q.size());
				System.out.println("On peeking Queue: " + q.peek());
				System.out.println("Does Queue contains 30? " + q.contains(30));
				break;
			}
			default: System.out.println("You have entered a wrong choice.");
		}
	}

}
