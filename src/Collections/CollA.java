package Collections;

import java.util.ArrayList;
import java.util.List;

public class CollA {
	
	public static void main(String[] args) {
	//Syntax//	List <data type> GH= new ArrayList<data type>();
		
		List <Integer> vc= new ArrayList<Integer>();
		vc.add(1); //index=0
		vc.add(3);//index=1
		vc.add(7);//index=2//Removed
		vc.add(9);//index=3
		vc.add(1);//Duplicate Value 
	
		int str= vc.size();// This is the code for counting the List Array.
		System.out.println("List : "+ str );
		
		//Removing the elements from Lists - Will learn in code 
		vc.remove(2);
		System.out.println("List of Array Removing : " + vc);
		
		//Adding All
	    int sum=0;
		//sum=sum+str;

	     for(int i:vc) {
	      sum= sum + i;
	    //0+1 =1 ,1+3=4 , 1+3+9=13  
	      System.out.println("Adding func : "+ sum);
	    
	}
		
		
		
	}

}

// A collection is an Object that represents a group of Individual Objects represented a Single Unit.
// A collection is a Dynamic Area , where we can Add elements and Remove elements.
//List - Use of list in collection ,List is an Interface in collection. It is always in ordered Ways.
//List can have duplicate Values. 
//List interface Implemented by Array List , LINKED LIST ,VECTOR and STACK.