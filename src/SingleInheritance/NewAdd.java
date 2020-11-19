package SingleInheritance;

public class NewAdd extends Calclogic{
	
	public static void Mul() {
		
		int e ,f ,Mul;
		
		e=20;
		f=30;
		Mul=e*f;
		
	System.out.println("Multi: " + Mul);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Calclogic Epp = new Calclogic(); Epp.add(); Epp.sub();
		 */
  
		 Calclogic.add();
		 Calclogic.sub();
		 NewAdd.Mul();
	}

}
