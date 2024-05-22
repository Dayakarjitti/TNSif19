package collectionsconcept;

import java.util.LinkedList;

public class TestLinkedlistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> marks = new LinkedList<Integer>();
     marks.add(99);
     marks.add(83);
     marks.add(55);
     marks.add(100);
     marks.add(48);
     marks.add(71);
     System.out.println(marks);
     marks.remove(2);
     System.out.println(marks);
     marks.set(3, 0);
     System.out.println(marks);
	}

}
