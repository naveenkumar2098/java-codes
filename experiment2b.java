package clgpractice;
import java.util.*;

class Vehicle { 
    int maxSpeed;
    
    Vehicle(){
    	this.maxSpeed = 100;
    }
} 
  
class Car extends Vehicle { 
    int maxSpeed;
    
    Car(int maxSpeed){
    	super();
    	this.maxSpeed = maxSpeed;
    }
  
    void display(){ 
        System.out.println("Maximum Speed of Vehicle: " + super.maxSpeed);
        System.out.println("Maximum Speed of Car: " + this.maxSpeed);
    } 
}

public class experiment2b {

	public static void main(String[] args) {
		Car A = new Car(180);
		A.display();
	}
}
