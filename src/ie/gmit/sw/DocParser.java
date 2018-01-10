package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DocParser implements Document{
	
	String path;
	String text;
	
	public DocParser(String path) throws IOException {
        this.path = path;

        BufferedReader reader = new BufferedReader(new FileReader(path));
        
        StringBuilder sb = new StringBuilder(); // String builder because it only builds once. += you recreate the string each and every time
        String line; // temporary variable to hold each line.
        while((line = reader.readLine()) != null){
            sb.append(line);
            //System.out.println(line);
        }
        text = sb.toString();

    }

	
	// @overrided because of interface
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
