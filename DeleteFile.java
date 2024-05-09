package filehandlingconcepts;
import java.io.File;
public class DeleteFile {
	
	public static void main(String[] args) {
		File Obj = new File("File.txt"); 
	    if (Obj.delete()) { 
	      System.out.println("Deleted the file: " + Obj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	}
}
