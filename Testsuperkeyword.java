package keywordsconcept;
//super is used to refer  parent class "instance variable".
class Animal{
		String color="black";
	}
class smallanimal extends Animal{
	String color="white";
	void display() {
		System.out.println(super.color);//super keyword is used to call the color from the parent class
		System.out.println(color);
	}
}



//super can be used to invoke parent "class method"

class HOD{
	public void teaching() {
		System.out.println("HOD mam is teaching non credits subject:");
	}
}
class faculty extends HOD{
	public void teaching() {
		System.out.println("faculty members are teaching another subject:");
	}
	void students() {
		super.teaching();
	}
}


//super is used to invoke parent class constructor.
 class parents{
	 public void dispaly() {
		 System.out.println("parent will always monitor the childrens");
	 }
 }
 class children extends parents{
	 
	 public void show() {
		 System.out.println("children will learn things from parents:");
	 }
	 
 }
 class child extends parents{
	 void learn() {
     //super();       "here super is used to call the constructor 
	 }
 }


public class Testsuperkeyword {
	public static void main(String[] args) {
		smallanimal an=new smallanimal();
		an.display();//calling the display instance variable using obj
		faculty f1=new faculty();//used to call the super class method
		f1.students();
		child ch=new child();//calling constructor
		ch.learn();
		ch.dispaly();
	}
}
