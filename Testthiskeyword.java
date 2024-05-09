package keywordsconcept;

class college{
	int rollno;
	String name;
	static String department="cybersecurity";
college(int rollno,String name,String department){
		this.rollno=rollno;
		this.name=name;
		college.department=department;
	}
	public void display() {
		System.out.println(rollno+" "+name+" "+department);
	}


public class Testthiskeyword {

	public static void main(String[] args) {
	    college obj=new college(231,"dayakar", department);
		obj.display();
		
		

	}

}
}
