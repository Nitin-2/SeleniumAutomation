package Hierarchical;

public class group extends rec1 {
	
	public void extens() {
		
		System.out.println("integration test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		group gd = new group();
		
		gd.inh();
		gd.extens();
		
		/*
		 * Rec2.mul();
		 * 
		 * rec1 rv= new rec1(); rv.inh();
		 */
	}
//Rec1 ---> Is a Parent Class
//Rec1 will be called Inside Rec2 and Group class
}
