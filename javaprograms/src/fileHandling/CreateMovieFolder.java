package fileHandling;

import java.io.File;
import java.io.IOException;


public class CreateMovieFolder {

	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Movie");
		f.mkdir();
		System.out.println("Folder has been created:");
		File f1=new File("C:\\Movie\\List.txt");
		f1.createNewFile();
		System.out.println(f1.exists());
		
		
			
		}
}
