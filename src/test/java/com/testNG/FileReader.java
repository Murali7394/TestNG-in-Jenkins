package com.testNG;

import java.io.*;

public class FileReader {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Murali\\Desktop\\data.txt");
		FileInputStream fis = new FileInputStream(f);
		int read = fis.read();
		
		

	}

}
