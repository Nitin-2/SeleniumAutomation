package Inheritance;

public class PhysicsTeacher extends Teacher {
	String mainsubject ="Physics";
	
	public void Goes()
	{
		
		System.out.println("Physiciiing");
	}
	public static void main(String[] args) {
		
		PhysicsTeacher obj = new PhysicsTeacher();
		
		System.out.println(obj.collegename);
	    System.out.println(obj.mainsubject);
	    System.out.println(obj.designation);
	  
	    Teacher.staffing();
	    
	   obj.Goes();

	}

}
