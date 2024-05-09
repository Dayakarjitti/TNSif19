package filehandlingconcepts;
import java.io.IOException;
import java.io.FileWriter;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter obj= new FileWriter("File.txt");
			obj.write("this is filehandling concept writing info into the file:");
			obj.close();
			System.out.println("successfully wrote info into the file:");
			
		}catch(IOException ex) {
			System.out.println("there is an error occured while writing the info:");
			ex.printStackTrace();
		}
		

	}

}
