package collectionsconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIteratorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(98);
		scores.add(87);
		scores.add(67);
		scores.add(50);
		scores.add(77);
		Iterator<Integer> it= scores.iterator();
		while(it.hasNext()) {
			if(it.next()>50) {
				System.out.println("you are score is above 50 ");
				System.out.println("keep doing this.....");
			}
			else {
				System.out.println("you score is not grater than 50 ");
				System.out.println("better luck next time....");
			}
			System.out.println(it.next());
		}
	
	}

}
