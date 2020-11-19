package Collections;

import java.util.HashSet;
import java.util.Set;

public class CollB {
//Assignment :- Create a SET with the Help of Integers and Double.
	
	public static void main(String[] args) {
	
	 Set<String> obj= new HashSet<>();
     obj.add("Nitin");
     obj.add("Van");
     obj.add("Cat");
     obj.add("eat");
     
     int Str=obj.size();
     System.out.println("Length print : "+ Str);
     System.out.println("Display String Array :"+ obj);
     
     	
     
}
	}



//SET :- Set is a Interface in Java Collection.
//We cannot enter duplicate values only Unique values.
//This is an Unordered Way.
//Synatx :- Set<String>test=new HashSet<>();
//Set Classes are 1) HashSet 2) TreeSet 3)LinkedHashSet
//Difference between List And Set.(Assignment).
//List can contain Duplicate values , Set doesnot contain Duplicate Values.
//List is an ordered way whereas Set is an Unordered way(Mix 1,3,2,9) It can maintain anything).
//
