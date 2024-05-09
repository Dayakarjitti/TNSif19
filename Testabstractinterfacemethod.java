package abstractconcept;

interface A{
	void display();
	void show();
}
abstract class B implements A{
	public void run() {
		System.out.println("this is abstract interface method.....");
	}
}
class M extends B {
   public void display() {
		System.out.println("this in display method.........");
	}
   public void show() {
	   System.out.println("this is show method...........");
   }
}
public interface Testabstractinterfacemethod {
			public static void main(String[] args) {
				A obj=new M();
				((B) obj).run();	// calling the run method
				obj.display();		//calling the display method
				obj.show();			//calling the show method
				
			}
}
