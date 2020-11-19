package InterfaceJava;

public class rail1 implements Session,newinterface {

	@Override
	public void eat() {
		
		System.out.println("eating");
		
	}

	//The type rail1 must implement the inherited abstract method Session.eat()

	public static void main (String [] args) {
		
		rail1 dc= new rail1();
		dc.eat();
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}
}
