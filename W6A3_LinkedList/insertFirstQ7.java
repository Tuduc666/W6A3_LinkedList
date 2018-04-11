/*
 * 6.	Write a Java program to insert elements into the linked list at the first and last position.
 */
package W6A3_LinkedList;

import java.util.LinkedList;

public class insertFirstQ7 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.addFirst(22);;     // insert 22 at first position index 0
			
		for (int i=0; i<list.size(); i++) {
			System.out.println("[" + list.get(i) + "]");
		}
		

	}

}
