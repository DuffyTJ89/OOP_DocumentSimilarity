package ie.gmit.sw;

import java.util.Scanner;

public class Menu {

	public void show() {
		System.out.println("*** Document Comparison Service ***");
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter file name / URL 1");
		String doc1 = userInput.next();
		System.out.println("Enter file name / URL 2");
		String doc2 = userInput.next();
		
		//System.out.printf(doc1 + doc2);
		System.out.println("Processing.. Please wait");
	}
}
