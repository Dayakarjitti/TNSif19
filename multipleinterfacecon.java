package Interfaceconcept;

public interface multipleinterfacecon {
 // Default method
 default void show() {
     System.out.println("this is defacult void method in interface");
 }
}

/*Interface 2
//extending the above interface or inheriting the multiple sub interfaces*/
interface Interface1 extends multipleinterfacecon  {
 // Abstract method
 void display();
}

/*Interface 3
extending the above interface*/
interface Interface2 extends multipleinterfacecon  {
 /* Abstract method*/
 void print();
}
class Main implements Interface1, Interface2 {
 public void display()
 {
     System.out.println(" this is display method from Interface1");
 }
 public void print()
 {
     System.out.println(" this is Print method  from Interface2");
 }
 public static void main(String args[])
 {
     Main obj = new Main();
     obj.show(); 
     obj.display(); 
     obj.print();
  }
}

