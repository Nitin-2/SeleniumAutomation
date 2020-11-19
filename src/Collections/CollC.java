package Collections;

import java.util.HashMap;
import java.util.Map;

public class CollC {
	
     
	public static void main(String[] args) {
		//Assignment Char and String use as key value mapping
		  //Treemap ,Hash Map
		Map<Integer,String> Vf=new HashMap<>();
		Vf.put(1, "Test1"); //Key=1 , Value =Test1
		Vf.put(2, "Test2"); 
		Vf.put(3, "Test3");
		Vf.put(4, "Test4");
		
		int Str=Vf.size();
		System.out.println("Display Size : "+ Str);
		
		System.out.println("Display MAP : " + Vf);

	}

}
//Syntax :- Map <Integer,String> cd= new HashMap<>();
//Map :- map is an Interface in Java Collection.
//A Map contains Key Value Pairing.
// Each key and Value Pair is known as Entry.
// A Map Contains unique keys.
// A Map can search , Delete and Update.M
// Map has few Classes 1) HashMap 2) Treeap 3) Linked HashMap.