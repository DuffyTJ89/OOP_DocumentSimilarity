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
		
		DocToShingle shingleCreator1 = new DocToShingle(document1, 3, queue);
		DocToShingle shingleCreator2 = new DocToShingle(document2, 3, queue);
		
		
		Thread t1 = new Thread(shingleCreator1);
		t1.start();
		Thread t2 = new Thread(shingleCreator2);
		t2.start();
		
		//System.out.println(queue.size());
		
	}

}
