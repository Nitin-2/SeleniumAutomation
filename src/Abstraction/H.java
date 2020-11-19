package Abstraction;

 class H extends S{
	
	void run() {
		
		System.out.println("Run safely");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    S obj = new H();  //need to Understand object creation done of two Classes
	obj.run();

	}

}
