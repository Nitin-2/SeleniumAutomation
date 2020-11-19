package MultiLevel_Inheritance;

public class truck extends bus {

	public void fly() {
		System.out.println("flying");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		truck tr= new truck();
		tr.dance();
		tr.drive();
		tr.fly();
		
		bus bc= new bus();
		bc.dance();
		bc.drive();

	}

}
//Car is a Parent Class of Bus
//Bus is a Parent Class of Truck
//MultiLevel is sequential---> it is 123


//--------------TASK------------------------------------

////SINGLE INHER
//MULTI LEVEL




// 
