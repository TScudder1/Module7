package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {
	String fileString;

	public String main() throws MalformedURLException {

		// create the URL
		URL file = new URL("http://shakespeare.mit.edu/macbeth/full.html");

		// Open the URL stream and create readers convert to string
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(file.openStream()));
			
			// write the output
			StringBuilder response = new StringBuilder();
			String inputLine;
			while ((inputLine = reader.readLine()) != null)
				response.append(inputLine);
			
			// close reader
			reader.close();
			
			fileString = response.toString();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}

		
		return fileString.toString();

	}


}
