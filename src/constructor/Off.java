package constructor;

public class Off {
	
	public  Off(int a, int b) { //1) Parameterized Constructor
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Off str = new Off(10,30);//1) Parameterized Constructor

	}

}
