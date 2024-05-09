package builtinmethods;


public class UserdefinemethodExample {

	 public void display() {
		 System.out.println("this method is display method contains users details:");
	 }
	  public static String show() {
		  return "this is dayakar jitti from cybersecurity";
		  
	  }
	  public int addnumber(int num1,int num2) {
	  
		return num1+num2;
	  }
		
	  	public static void main(String[] args) {
	  		UserdefinemethodExample obj=new UserdefinemethodExample();
	  		obj.addnumber(14, 26);
	  		obj.display();
	  		System.out.println(UserdefinemethodExample.show());
	  	}
	}
 		


