package Condition;

public class Array {

	public static void main(String[] args) {
		
		//what is an array : storing the data /value in the form of array
		//array has a fixed length
		//signature of array is []
		//array can be defined in two ways
		
		//First way
		int a[] = new int[4];//0,1,2,3
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
         
		int str=a.length;
		System.out.println("count :" + str);
		
		for(int i=0;i<str;i++) {
			System.out.println("Display String :" + a[i]);
		}
		
		//second way
		int b[]= {2,4,6,8};
		int obj=b.length;
		System.out.println("count :" + obj);
		
		for(int i=0;i<obj;i++) {
			System.out.println("Display String :" + b[i]);
		}
		

	}

}
