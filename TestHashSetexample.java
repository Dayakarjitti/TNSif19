package collectionsconcept;

import java.util.HashSet;

public class TestHashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> employeenames = new HashSet<String>();
		employeenames.add("dayakar jitti");
		employeenames.add("raju gandla");
		employeenames.add("shivaraj emmidi");
		employeenames.add("dayakar jitti");  // HashSet won't allow the duplicate values 
		System.out.println(employeenames);
	}

}
