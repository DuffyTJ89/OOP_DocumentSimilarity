package ie.gmit.sw;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Launcher {
	
	public void launch(String doc1, String doc2) throws IOException
	{
		//System.out.println("Launcher : "+doc1+", "+doc2);
		
		Document document1 = new DocParser(doc1);
		Document document2 = new DocParser(doc2);
		
		BlockingQueue<Shingle> queue = new LinkedBlockingDeque<>();
		
		DocToShingle shingleCreator = new DocToShingle();
		
	}

}
