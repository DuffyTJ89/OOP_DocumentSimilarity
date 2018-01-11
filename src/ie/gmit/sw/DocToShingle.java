package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class DocToShingle implements Runnable 
{
	//take document and break it up into shingles.
	private Document document;
    private int shingleSize;
    private BlockingQueue<Shingle> queue;
    
    public DocToShingle (Document document, int shingleSize, BlockingQueue<Shingle> queue)
    {
    	this.document = document;
        this.shingleSize = shingleSize;
        this.queue = queue;
    }//end DocToShingle

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		//System.out.println("DocToShingle: "+ document);
		
        String[] words = document.getText().split("[ \\s=+,.?\";!\\-\\n]"); // break up the text into an array of words. use regex to ignore certain characters
        int pos = 0;
        //System.out.println("DocToShingle: wordsLength" + words.length);
        
        while (pos < words.length) 
        { 	//keep going until get to the last character
        	
            List<String> shingles = new ArrayList<>(); //make a new list for each shingle
            
            for (int i = pos; i < pos + shingleSize; i++) //loop for shingle size
            { 
                	if (i == words.length) 
                	{	// break if i > words.length
                		break; //happens if words.length is not a multiple of 3
                	}//end if
                	
                shingles.add(words[i]);
            }//end for
            
            System.out.println(shingles); //list created with all the words needed to create a shingle.
            Shingle shingle = new Shingle(shingles, document.getId());
        
            try //put onto the queue
            {
                queue.put(shingle); //put method blocks all others from trying to put onto the same queue
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pos += shingleSize;
            //System.out.println("DocToShingle:"+ words[pos]);
        }//end while 
	}//end run()
}//end 
