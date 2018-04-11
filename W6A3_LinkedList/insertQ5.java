/*
 * 5.	Write a Java program to insert the specified element at the specified position 
 * in the linked list.
 */
package W6A3_LinkedList;

import java.util.LinkedList;

public class insertQ5 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.add(2, 66);     // insert 66 at index 2
			
		for (int i=0; i<list.size(); i++) {
			System.out.println("[" + list.get(i) + "]");
		}
		

	}

}
