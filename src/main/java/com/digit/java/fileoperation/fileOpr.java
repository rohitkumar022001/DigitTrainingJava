package com.digit.java.fileoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOpr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path1="C:\\Users\\Rohit.Kumar02\\Downloads\\input.txt";
		String path2="C:\\Users\\Rohit.Kumar02\\Downloads\\output.txt";
		try {
			FileInputStream fin=new FileInputStream(path1);
			FileOutputStream fop=new FileOutputStream(path2);
			int temp;
			while((temp=fin.read())!=-1) {
				fop.write(temp);
			}
			fin.close();
			fop.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
