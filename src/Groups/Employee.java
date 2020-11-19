package Groups;


public class Employee {
	
final int a =10;  // If we declare FINAL Keyword with Instance variable ,the value of that instance variable will never change
int sum;
int b;

public void add() {
	//a=70;
	   b=30;
    sum=a+b;
	
	System.out.println("Add : " + sum );
}

public void sub() {
	  b=30;
   sum=b-a;
	
	System.out.println("sub : " + sum );
}

public static void main (String []args) {
	
	Employee ob= new Employee();
	ob.add();
	ob.sub();
	
}
}


//final keywords:- Final is a Keyword.
// 2. It can be applied to variables ,methods and classes.
//3. It is used to give restrictions to the Users.

// static
