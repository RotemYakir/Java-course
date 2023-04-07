package a.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		File file = new File("temp/rotem/letter.txt");
		
		boolean append = true; // if append is set to true - data will be added to the existing data in the file
		 append = false; // if append is set to false - the existing data will be erased and then new data will be added
		try (FileWriter out = new FileWriter(file,append);){
			out.write("hello file IO\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("text written to "+ file);
	}

}
