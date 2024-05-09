package ploymorphismconcept;

public class Compiletimepolymorphism {
	
		 double add(int x,double y){
			return (x+y);
		}
	    double add(double x,int y) {
	    	return (x+y);
	    }
	    double add(double x,float y) {
	    	return (x+y);
	    }
public static void main(String args[]) {
	int a=5;
	double b=10.5;
	float c=(float) 3.4;
	Compiletimepolymorphism c1 = new Compiletimepolymorphism();
	c1.add(a, b);
	c1.add(b, a);
	c1.add(b, c);
	
}
}