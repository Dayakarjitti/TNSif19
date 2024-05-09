package overloadconcept;
class Vehicle {
    void display() {
        System.out.println("the is running so fast based on the capacity of the tank.");
    }
}
class Car extends Vehicle {
    void display() {
        System.out.println("the car is running more fast when compared to the other vehicle");
    }
}


class Bike extends Vehicle {

    void display() {
        System.out.println("bike is more fast speed when compared to the car speed ");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Vehicle myVehicle; 

       
        myVehicle = new Car();
        myVehicle.display(); 

        
        myVehicle = new Bike();
        myVehicle.display(); 
    }
}
