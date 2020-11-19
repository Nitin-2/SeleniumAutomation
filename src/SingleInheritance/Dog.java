package SingleInheritance;

public class Dog extends Animal {

	public static void bark() {
		
		System.out.println("Dog is Barking");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Dog dj= new Dog();
		 * 
		 * dj.bark(); dj.eat();
		 */
		
		//Question :- I was not able to call few methods like sleep ,walk from other class by using objects call
		//Parent Classname.method
	
		Animal.eat();
		Animal.sleep();
		Animal.walk();
		Dog.bark();
		
		
    
    
    
	}

}
