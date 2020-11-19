package Encapsulation;

public class A {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public static void main(String[]args)
	{
		
		A obj= new A();
		obj.setA(100);
	  System.out.println("Value display as : " + obj.getA());	
	}
}


//Encapsulation means wrapping of data in to single Unit.
//Variables Defined in Encapsulation should be Private.
//Encapsulation is achieved through "getter" and "setter".
//Getter means Displays data.
//Setter means Set the value.
//This---> Keyword is used as reference variable of parent class (Like we have inta variable of Class A).