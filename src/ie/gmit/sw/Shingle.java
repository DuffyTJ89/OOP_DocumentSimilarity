package ie.gmit.sw;

import java.util.Collection;

public class Shingle 
{

	private int docId;
	private int hashcode;
	
	public Shingle(Collection<String> words, int docI) //create a collection to store the words for the shingle
	{
		String allWorlds = String.join(" ", words).toLowerCase();
        hashcode = allWorlds.hashCode();
        this.docId = docId;
	}
	
	public int getDocId() 
	{
		return docId;
	}
	public void setDocId(int docId) 
	{
		this.docId = docId;
	}
	public int getHashcode() 
	{
		return hashcode;
	}
	public void setHashcode(int hashcode) 
	{
		this.hashcode = hashcode;
	}
	
}//end shingle class
