package filewritingoperations_23_5_2022;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// to create a file in this directory
		String userdirectory = System.getProperty("user.dir");

		// 1.need to give file location
		String location = "FileoutputstreamWriting.txt";
		// 2. write the content using string
		String content = "Life is too simple";

		String path = userdirectory + File.separator + "File" + File.separator + location;

		FileOutputStream outputStream = new FileOutputStream(path);
		byte[] writethis = content.getBytes();

		outputStream.write(writethis);
		outputStream.close();

		System.out.println("file has been created");

	}

}
