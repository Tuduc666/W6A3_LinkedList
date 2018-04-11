/*
 * 3.	Write a Java program to iterate through all elements in a linked list 
 * starting at the specified position.
 */
package W6A3_LinkedList;

import java.util.LinkedList;

public class iterateQ3 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		int startpos = 2;
		
		for (int i=startpos; i<list.size(); i++) {
			System.out.println("[" + list.get(i) + "]");
		}
		

	}

}
