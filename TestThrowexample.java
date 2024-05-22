package Exceptionhandlingconcept;

public class TestThrowexample {
	
	public void display() {
		int age=15;
		if(age<18) {
		throw new ArithmeticException("Access denied :- you must be atleast 18 years old.");
		}
		else {
			System.out.println("Access granted  your olg enough"+age);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThrowexample th=new TestThrowexample();
		th.display();
		
		}
	
	}


