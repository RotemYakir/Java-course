package a.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo3 {

	public static void main(String[] args) {

		File file = new File("temp/rotem/letter.txt");
		
		boolean append = true;
		try (PrintWriter out = new PrintWriter(new FileWriter(file,append));){
			out.println("hello file IO");
			out.print(5);
			out.print(Math.random());
			out.print(Math.PI);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("text written to "+ file);
	}

}
