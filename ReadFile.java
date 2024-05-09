package filehandlingconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) {
		try {
			
		      File myObj = new File("File.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();

			
		} catch (FileNotFoundException e) {
			System.out.println("there is An error occurred while reading the text.");
		    e.printStackTrace();

		}
	}

}
