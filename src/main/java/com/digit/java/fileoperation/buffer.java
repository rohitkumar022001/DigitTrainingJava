package com.digit.java.fileoperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class buffer {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String path1="C:\\Users\\Rohit.Kumar02\\Downloads\\input.txt";
		String path2="C:\\Users\\Rohit.Kumar02\\Downloads\\output1.txt";
		try {
			FileReader fin=new FileReader(path1);
			FileWriter fop=new FileWriter(path2);
			int temp;
			while((temp=fin.read())!=-1) {
				fop.write(temp);
			}
			fin.close();
			fop.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
