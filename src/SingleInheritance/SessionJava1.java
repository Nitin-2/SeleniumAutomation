package SingleInheritance;

public class SessionJava1 {
	
	int a;//instance variable
	static int b;//static variable
	
	public void sub() {
		int c,n,subtraction;//local variable
		c=20;n=10;
		subtraction = n-c;
		System.out.println("subtraction :" + subtraction);
	}
public void div() {
	
	int e,f,division;
	e=30;
	f=5;
	division= e / f;
	System.out.println("divison :" +division);
	
	
	
}
public void mul() {
	int m,n,mul;
	
	m=6;
	n=8;
	mul= m*n;
	System.out.println("Multiplication :" +mul);
	
}

public void mod() {
	int z,y,md;
	z=39;
	y=19;
	md=z%y;
	
	System.out.println("Modulus :" + md);
	
}
	public static void main (String[] args) {
		//execution start here
		//creation of objects
		//object is created only for classes/subclasses
		
		SessionJava1 obj = new SessionJava1();
		obj.sub();
		obj.div();
		obj.mul();
		obj.mod();
	}
}
