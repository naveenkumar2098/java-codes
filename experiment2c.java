package clgpractice;
import java.util.*;

class Shape{
    void draw(){
        System.out.println("Draw shape");
    }
}

class Circle extends Shape{
    void drawCircle(){
        System.out.println("Draw Circle");
    }
}

class Watch{
    void display(){
        System.out.println("WATCH");
    }
}

class Titan extends Watch{
    void property(){
        System.out.println("TITAN");        
    }
}

class Raga extends Titan{
    void type(){
        System.out.println("RAGA");
        System.out.println("Classic Collection");
    }
}

class Laptop{
    void display(){
        System.out.println("Working...");
    }
}

class Dell extends Laptop{
    void print(){
        System.out.println("Dell Inspiron");
    }
}

class Lenovo extends Laptop{
    void show(){
        System.out.println("Lenovo YOGA");
    }
}

public class experiment2c {

	public static void main(String[] args) {
		int choice;
		Scanner s = new Scanner(System.in);
		System.out.println("Which Interitance do you want to implement?");
		System.out.println("1. Single");
		System.out.println("2. Multilevel");
		System.out.println("3. Hierarchical");
		choice = s.nextInt();
		switch(choice) {
			case 1:{
				Circle c  = new Circle();
			    c.draw();
			    c.drawCircle();
			    break;
			}
			case 2:{
				Raga r = new Raga();
		        r.display();
		        r.property();
		        r.type();
		        break;
			}
			case 3:{
				Dell d = new Dell();
		        d.print();
		        d.display();
		        Lenovo l = new Lenovo();
		        l.show();
		        l.display();
		        break;
			}
			default: System.out.println("You have entered a wrong choice.");
		}
	}

}
