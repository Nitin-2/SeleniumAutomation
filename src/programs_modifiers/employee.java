package programs_modifiers;

public class employee {
	
int	value;

	
public void add(int a,int b) {
 value =a+b;
 System.out.println("Add value : "+ value);		
}

protected void sub(int a,int b) {
	 value =b-a;
	 System.out.println("Sub value : "+ value);		
	}

 void Mul(int a,int b) {
	 value =a*b;
	 System.out.println("Mul value : "+ value);		
	}

private void Div(int a,int b) {
	 value =a/b;
	 System.out.println("Division value : "+ value);		
	}
	
	

}
