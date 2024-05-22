package collectionsconcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class TestHashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> employee = new HashMap<String,Integer>();
		employee.put("ranjith", 700000);
		employee.put("dayakar", 500000);
		employee.put("navatha", 1000000);
		System.out.println(employee);// printing all the values in the HashMap
		System.out.println(employee.getClass());// get class name 
		System.out.println(employee.get("navatha"));// get particular value
		System.out.println();
		
		// check HashMap is empty or not
		if(employee.isEmpty()) {
			System.out.println("HashMap is empty");
		}
		else {
			System.out.println("HashMap is not empty, it contains some of the values :");
		}
		// inorder to remove the employee
		employee.remove("ranjith");
		System.out.println(employee);
		System.out.println("\n");
		//inorder to get the getkey value and getvalue for each person
		for(Entry<String, Integer> emp:employee.entrySet()) {
			System.out.println("key:"+emp.getKey()+" value is :"+emp.getValue());
			System.out.println("\n");
		}
		
		for(String name: employee.keySet()) {
			System.out.println(name);
		}
		for(Integer sal: employee.values()) {
			System.out.println(sal);
			
		}
	}


}
