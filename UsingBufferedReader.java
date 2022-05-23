package filereadingoperation_23_5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String userDirectory = System.getProperty("user.dir");
		String filename = "BufferedWriting.txt";
		String path = userDirectory + File.separator + "File" + File.separator + filename;
		// to read the particular file
		FileReader fileReader = new FileReader(path);
		//
		BufferedReader fileread = new BufferedReader(fileReader);
		// this is for to read the single line readLine()
		String currentLine;
		// to read multiple line
		while ((currentLine = fileread.readLine()) != null) {
			System.out.println(currentLine);
		}
	}

}
