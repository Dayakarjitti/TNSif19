package inheritanceconcept;
class Animals{  
void eat()
{
	System.out.println("eating...");
	}  
}  
class cat extends Animals{  
void bark()
{
	System.out.println("barking...");
	}  
}  
class Babycat extends cat{  
void weep()
{
	System.out.println("weeping...");
	}  
}  
class TestMultilevelInheritance
{  
public static void main(String args[])
{  
Babycat d=new Babycat();  
d.weep();  
d.bark();  
d.eat();  
}
} 


