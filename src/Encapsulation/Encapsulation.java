package Encapsulation;

public class Encapsulation {
	private int ssn;
	private String empname;
	private int empAge;
	
	public void Dubbo(int ssn) {
		this.setSsn(ssn);
		
	}
	
	public void subbo(String empname) {
		
		this.setEmpname(empname);
		
	}
     
	public void tubbo(int empAge) {
		
		this.setEmpAge(empAge);
		
	}
	
	

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	

		Encapsulation obj= new Encapsulation();
		obj.setEmpAge(22);
		obj.setEmpname("Nitin Sharma");
		obj.setSsn(309);
		
	System.out.println("Social No :" + obj.getEmpAge());
	System.out.println("Empname : " + obj.getEmpname());
	System.out.println("Age :" + obj.getSsn());
	}
}
