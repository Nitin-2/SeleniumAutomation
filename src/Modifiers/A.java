package Modifiers;

public class A {
	
	public void B() { //it can be accessible globally-outside package and class
		System.out.println("public method");
	}

	private void C() {//accessibility within the class
		
		System.out.println("private method");
	}
	
	void D() {// nO mODIFIERS Are define for the Default Modifiers.
		//within the Class and With the package accessible.
		
		
	
		
	System.out.println("Default method");
	
	}
	
	
	protected void E() {
		
		System.out.println("Protected method");
		
	}
}




// Class === Only Public and Defaults are used to define class
// Method == public , Protected ,Private and Default are used by method.
