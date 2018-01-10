package ie.gmit.sw;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public void show() throws IOException {
		System.out.println("*** Document Comparison Service ***");
		
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter file name 1");
		String doc1 = userInput.next();
		System.out.println("Enter file name 2");
		String doc2 = userInput.next();
		
		//System.out.printf(doc1 + doc2);
		System.out.println("Processing.. Please wait");
		
		new Launcher().launch(doc1, doc2);
	}
}
