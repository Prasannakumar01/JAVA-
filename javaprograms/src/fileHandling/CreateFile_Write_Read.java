package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile_Write_Read {

	public static void main(String[] args) throws IOException {
		File folder=new File("C:\\MONTHS");
		folder.mkdir();
		File f=new File("C:\\MONTHS\\Month");
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println("Janurary");
		pw.println("Febraury");
		pw.println("March");
		pw.println("June");
		pw.println("July");
		pw.println("August");
		pw.println("September");
		pw.println("October");
		pw.println("November");
		pw.println("December");
		pw.flush();
		
		
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		String line =br.readLine();
		while(line!=null) {
			System.out.println(line);
			line= br.readLine();
	
		}
		
		br.close();
		pw.close();
		
	}

}
