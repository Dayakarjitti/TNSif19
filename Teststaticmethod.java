package keywordsconcept;

class student {
	int rollno;
	String name;
	static String college="CSE";
	static void change() {
		college="sriindu";
	}
	student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
	
		System.out.println(rollno+" "+name+" "+college);
	}
}


public class Teststaticmethod {

	public static void main(String[] args) {
		student s1=new student(231,"dayakar");
		student s2=new student(232,"raju");
		student s3=new student(233,"navatha");
		s1.display();
		s2.display();
		s3.display();
	}

}
