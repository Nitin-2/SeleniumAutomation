package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class testA {
	
	public static void main (String[]args) throws FileNotFoundException {
		
		File file= new File("D://file.txt");
   FileReader fr= new FileReader(file);	
	}

	
	
}
// An Exception is a problem or issue arising during execution of a program eg:- Syntax error,Compile time error
//netwrok error , Invalid data

//Checked exception and Unchecked Exception- 2types
//Checked exception is exception when checked by compiler at compile time. eg:- file not found exception.
//Unchecked exception is the exception which occurs at Run time exception. eg - Array eg

//Asignment-Rand D - IO exception Apart from Try ,throws find other used in Selenium used ?
//Io exception,element not found , Arithmetical Exceptions.