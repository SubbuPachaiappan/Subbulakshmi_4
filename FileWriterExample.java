package filewritingoperations_23_5_2022;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// to create a file in this directory
		String userdirectory = System.getProperty("user.dir");

		// 1.need to give file location
		String location = "FileWriting.txt";
		// 2. write the content using string
		String content = "Life is so simple";

		String path = userdirectory + File.separator + "File" + File.separator + location;

		FileWriter writefile = new FileWriter(path);
		// to write content
		writefile.write(content);
		// to finish content
		writefile.close();

		System.out.println("file has created");

	}

}
