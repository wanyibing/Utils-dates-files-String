package com.wanyibing.cms.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

	/**
	 * 缓冲流读取
	 * @throws FileNotFoundException 
	 */
	public static String ReadLine(String str) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(str);
		InputStreamReader isr =  new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		
		try {
			if((s = br.readLine())!=null) {
				String q = s;
				return s;
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	
	
	
}
