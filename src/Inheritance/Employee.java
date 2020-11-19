package Inheritance;

public class Employee extends Salary {
	
	public void sleep() {
		
		System.out.println("sleeping");
	}
public static void main(String[]args) {
	
	/*
	 * Employee obj= new Employee(); obj.eat(); obj.sleep();
	 */

//classname.methodname
 Salary.drink();
 Salary.eat();
	
}
	
}
//Salary is a parent class 
// Employee is a child class
//employee extends salary--->It means all the methods inside salary which is a parent class will get inherit in child class employee
//