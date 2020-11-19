package Exception;

public class tryCatch {
	
	public static void main(String[] args) {
		try {
			int a[]= new int [5];
			System.out.println("Display : " + a[7]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//try we write code
		//catch we catch exception ,exception can be customized.

	}

}
