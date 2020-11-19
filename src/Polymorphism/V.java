package Polymorphism;

public class V {
         int num;
         double addition;
	//Overloading 
	public void Add(int a, int b) {
		num=a+b;
		System.out.println("Number adding :" +num);
	}
	
	public void Add(double a, float b) {
		addition=a+b;
		System.out.println("Number adding :" +num);
	}
	
	public void Add(int a, int b, int c) {
		num=a+b+c;
		System.out.println("Number adding :" +num);
	}
    
	public static void main (String[]args) {
		
		V dc= new V();
		
		dc.Add(2, 5);
		dc.Add(4, 6, 8);
		
		
	}
}


//Polymorphism :- poly means MANY and morphism -> FORM, 
// A Single Task can be performed in many ways.
//Polymorphism can be achieved in Two Ways:- 1) method overloading 2) Method Overriding.
// Method Overloading :- Same method name with different parameters.
//Method Overriding :- A method which is already there in Parent Class is over-riden in Child Class. 
