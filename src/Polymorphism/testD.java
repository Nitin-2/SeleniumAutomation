package Polymorphism;

public class testD {

	public void Add(int a,int b) {
		
		int sum=b-a;               //overiding
		System.out.println("Sum : "+ sum);
			
		}
	public static void main(String[]args) {
		
		testD cv= new testD();
		cv.Add(3, 5);
	}
}
