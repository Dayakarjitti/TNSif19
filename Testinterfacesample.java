package Interfaceconcept;


 interface Testinterface{
	 
 void display();
}
class student implements Testinterface {

 public void display(){ 
   System.out.println("this is interface display method"); 
   System.out.println("\n");
 }
}
 
// New Interface declaration  for 2cd example
interface Drawable{  
void draw();  
}  
//Implementation of subclass using implements comcepts  
class Rectangle implements Drawable{  
public void draw()
{
	System.out.println("drawing rectangle");
}  
}  
class Circle implements Drawable{  
public void draw()
{
	System.out.println("drawing circle");
}  
}  
 
 public interface Testinterfacesample {
 
	 public static void main(String[] args)
	 {
     student obj = new student();
     obj.display();
     
     Drawable d=new Circle();	//creating the reference for the circle class  
     d.draw(); 
     Drawable rect=new Rectangle();
     rect.draw();
	 }
}
