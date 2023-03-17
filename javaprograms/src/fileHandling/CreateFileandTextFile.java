package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileandTextFile {

	public static void main(String[] args) throws IOException {
		
			File f= new File("C:\\FileHandle");
			f.mkdir();
			System.out.println("New File has been created...");
			
			File f1= new File("C:\\FileHandle\\Create.txt");
			f1.createNewFile();
			
			System.out.println("File has been created successfull");
			
			if(f.exists())
			{  
				
				f1.delete();  
				f.delete();
		
			}
			
			System.out.println("The folder has been deleted successfully:");
		 
	}

}
