package com.digit.java.collectionFramework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class bufferReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path1="C:\\Users\\Rohit.Kumar02\\Downloads\\input.txt";
		String path2="C:\\Users\\Rohit.Kumar02\\Downloads\\output2.txt";
		try {
			FileReader fr=new FileReader(path1);
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter(path2);
			BufferedWriter bw=new BufferedWriter(fw);
			int temp;
			while((temp=br.read())!=-1) {
				bw.write(temp);
			}
			bw.flush();
			fw.flush();
			br.close();
			fr.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
