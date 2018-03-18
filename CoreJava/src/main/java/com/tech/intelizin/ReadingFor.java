package com.tech.intelizin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFor {

	public static void main(String[] args) {

		String s;
		try {
			FileReader fr = new FileReader("myFile.txt");
			BufferedReader br = new BufferedReader(fr);
			while((s=br.readLine())!= null)
				System.out.println(s);
			
//			br.flush
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
