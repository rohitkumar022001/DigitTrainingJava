package com.digit.java.collectionFramework;

import java.io.File;
import java.io.IOException;


public class fileoperation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Rohit.Kumar02\\Desktop\\fileop\\text.txt";
		File f=new File(path);
		f.createNewFile();
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.canExecute());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.isHidden());
		System.out.println(f.getClass());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		

	}

}
