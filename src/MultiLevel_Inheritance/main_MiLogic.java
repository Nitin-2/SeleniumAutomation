package MultiLevel_Inheritance;

public class main_MiLogic extends mi_mul {

	public void mod() {
		
	int k,l,modulus;
	k=65;
	l=15;
	modulus=k%l;
	
	System.out.println("Moduling :" + modulus);
	
	}
	
	public void playing() {
		
		System.out.println("Playing soccer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		main_MiLogic jio = new main_MiLogic();
		jio.addy();
		jio.multi();
		jio.div();
		jio.mod();
		jio.playing();
		
		
		
		mi_mul bd = new mi_mul();
		
		bd.multi();
		bd.subby();
		
		
	}

}
