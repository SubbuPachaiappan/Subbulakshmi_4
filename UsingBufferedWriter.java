package filewritingoperations_23_5_2022;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// to create a file in this directory
				String userdirectory = System.getProperty("user.dir");

				// 1.need to give file location
				String location = "BufferedWriting.txt";
				// 2. write the content using string
				String content = "Life is too simple";

				String path = userdirectory + File.separator + "File" + File.separator + location;
				//create filewriter class to initiate the file 
				FileWriter writefile = new FileWriter(path);
				//create bufferedwriter class , it does not connect the file directly
				BufferedWriter bufferedwriter= new BufferedWriter(writefile);
				// to write content
				bufferedwriter.write(content);
				// to finish content
				bufferedwriter.close();
				
				System.out.println("file has been created");


	}

}
