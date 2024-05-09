package filehandlingconcepts;
import java.io.File;
import java.io.IOException;

public class CreatFile {
		
		public static void main(String[] args) {
			try {
			
			File obj =new File("file.txt");
			if(obj.createNewFile()) {
			
				System.out.println("file created:"+obj.getName());
			}
			else {
				System.out.println("file already exists");
			}
		}catch(IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}

}
}
