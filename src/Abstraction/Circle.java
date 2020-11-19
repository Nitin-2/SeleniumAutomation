package Abstraction;

public class Circle extends Shape {
	void draw() {
		
		System.out.println("draw circle");
	}
public static void main (String[]args) {
	
	Shape se = new Circle();
     se.draw();
}
}
