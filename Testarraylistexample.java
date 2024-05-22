package collectionsconcept;
import java.util.ArrayList;

public class Testarraylistexample {
	public static void main(String[] args) {
		ArrayList<Integer> score = new ArrayList<Integer>();
		score.add(10);
		score.add(20);
		score.add(30);
		score.add(40);
		score.add(50);
		//score.remove(3);
		//score.clear();
		score.set(4, 1426);
			System.out.println(score);
			System.out.println(score.get(2));
			System.out.println(score.getClass());
		}
	}


