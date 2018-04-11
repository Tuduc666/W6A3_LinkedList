/*
 * 2.	Write a Java program to iterate through all elements in a linked list.
 */
package W6A3_LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class iterateQ2 {

	public static void main(String[] args) {
		Queue<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		for (int i : list) {
			System.out.println("[" + i + "]");
		}
		

	}

}
