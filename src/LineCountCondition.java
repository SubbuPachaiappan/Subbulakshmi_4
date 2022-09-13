package chs_task;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LineCountCondition {
	Scanner scantext = new Scanner(System.in);
	String userWorkingDirectory = System.getProperty("user.dir");
	String pathSeparator = System.getProperty("file.separator");
	String fileName = scantext.nextLine();
	String path = userWorkingDirectory + pathSeparator + "File" + pathSeparator + fileName;
	File file = new File(path);

	void creatingFile() {

		// to find the file is already exist
		boolean present = file.exists();
		System.out.println("File Present - " + present);

		// if the file is not, use if to create a file
		if (present == false)
			try {
				boolean created = file.createNewFile();
				System.out.println("File Created :" + created);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

	void writingcontent() {
		int numberOfLines = 10;
		String sentences;

		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		System.out.println("Enter the content to store in file");
		for (int line = 0; line < numberOfLines; line++) {
			sentences = scantext.nextLine();
			
			try {
				bufferWriter.write(sentences);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bufferWriter.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			bufferWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bufferWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void readFile() {
		File file = new File(path);
		 
        try {
            BufferedReader readfile = new BufferedReader(new FileReader(file));
            if (readfile.readLine() == null) {
                System.out.println("File is empty");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		}

	}
