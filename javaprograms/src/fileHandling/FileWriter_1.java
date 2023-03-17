package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.PrintWriter;


public class FileWriter_1{

	public static void main(String[] args) throws Exception {
		File folder =new File("C:\\FileHandle");
		folder.mkdir();
		File file =new File("C:\\FileHandle\\Flowers.txt");
		    file.createNewFile();
		    FileWriter f=new FileWriter(file);
		    BufferedWriter bw=new BufferedWriter(f);
		    try (PrintWriter pw = new PrintWriter(bw)) {
				pw.println("1:"+"Lilly");
				pw.println("2:"+"Jasmine");
				pw.println("3"+"Rose");
				pw.println("4:"+"Marigold");
				pw.println("5:"+"RedRose");
				pw.println("6"+"SunFlower");
				pw.println("7"+"Hibiscus");
				pw.println("8"+"Tulips");
				pw.println("9"+"Daisy");
				pw.println("10"+"Almanda");
				pw.flush();
			}
		    
		    

	}

}
