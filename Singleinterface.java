package Interfaceconcept;

public interface Singleinterface {
	void display();

}
 class secondclass implements Singleinterface{


	public void display() {
		// TODO Auto-generated method stub
		System.out.println("interface implemtation method:");
	}
	 
 }
 class parents {
	 public static void main(String[] args) {
	 
		 secondclass obj=new secondclass();
		 obj.display();
	 }
	 }