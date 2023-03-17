package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingText {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\FileHandle\\Create.txt");
		FileReader fr = new FileReader(f);
		try (BufferedReader br = new BufferedReader(fr)) {
			String line =br.readLine();
			while(line!=null) {
				System.out.println(line);
				line=br.readLine();
			//	f.delete();
			}
			
		}
	
		

	}

}
