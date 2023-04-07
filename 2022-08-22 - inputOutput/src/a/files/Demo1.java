package a.files;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {

		// directory
		//File directory = new File("c:/temp/rotem");
		 File directory = new File("temp/rotem");
		if (!directory.exists()) {
			System.out.println("creating " + directory);
			directory.mkdirs();
		}

		// directory
		File file = new File(directory, "letter.txt");
		if (!file.exists()) {
			System.out.println("creating " + file);
			try {
				file.createNewFile(); // actually creating the file
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
