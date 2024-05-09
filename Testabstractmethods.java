package abstractconcept;
////Example of an abstract class that has abstract method 

abstract  class shape{    	//abstract class ;
	abstract void  drawing();	//abstract method"drawing";
}
class circle extends shape{
	void drawing() {
		System.out.println("drawing the circle shape");
		System.out.println("\n");
	}
}
class triangle extends shape{
	void drawing() {
		System.out.println("drawing the triangle shape");
	}
}
class rectangle extends shape{
	void drawing() {
		System.out.println("drawing the rectangle shape");
		//System.out.println("\n");
	}
}

//Example of an abstract class that has abstract and non-abstract methods  

abstract class parents{
	void display() {
		System.out.println("parents will always give you the best ..........");
	}
	abstract void run();
	void show() {
		System.out.println("this is abstract class method........");
		//System.out.println("\n");
	}
}

class children extends parents{
	void run() {
		System.out.println("this is subclass ...");
		System.out.println("\n");
	}
}




//Abstract class having constructor, data member and methods
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike{  
 Bike()
 {
	 System.out.println("bike is ready to start ");
 }  
 abstract void run();  
 void changeGear()
 {
	 System.out.println("gear changed according to the situation");
 }  
}  
//Create a Child class for  inheriting the  Abstract class  
class Honda extends Bike
{  
void run()
   {
	System.out.println("running safely..while driving the bike");
    }  
}  


public class Testabstractmethods {
		public static void main(String[] args) {
			shape s1=new rectangle();
			s1.drawing();
			shape s2=new triangle();
			s2.drawing();
			shape s3=new circle();
			s3.drawing();
			
			//crating the object for the child class
			parents obj=new children();
			obj.display();
			obj.show();
			obj.run();
			
			Bike obj2 = new Honda();  
			obj2.run();  
			obj2.changeGear();
		}
}
