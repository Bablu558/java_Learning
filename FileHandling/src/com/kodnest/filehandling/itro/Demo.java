package com.kodnest.filehandling.itro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
public static void main(String[] args) throws IOException {
	String path1 = "D:\\Kodnest_Java\\kodJuly\\input.txt";
	String path2 = "D:\\Kodnest_Java\\kodJuly\\output.txt";
	
	FileInputStream fis = new FileInputStream(path1);
	FileOutputStream fos = new FileOutputStream(path2);
	
	int data;
	while((data = fis.read())!=-1){
		fos.write(data);
	}
	fis.close();
	fos.close();
}
}
