package Encapsulation;

public class B {
	
	
	private int b;
	
	
	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	public static void main (String [] args)
	{
		
		
		B obj =new B();
		obj.setB(200);
		
		System.out.println("Value : " + obj.getB());
	}
}
