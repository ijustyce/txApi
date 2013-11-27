package com.txh.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ReadFile {
	
	/**
	 * ��ȡ�ı��ĵ����������ı�����
	 * @param filePath �ı��ĵ���·�� 
	 * @param encoding �ı����룬���磺gbk��utf-8
	 * @return �ĵ�����
	 */
	public String readFile(String filePath ,String encoding){
		
        File file=new File(filePath);
        String content = "";
        try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
			 BufferedReader bufferedReader = new BufferedReader(read);
			 String line ;
             while((line = bufferedReader.readLine()) != null){
            	 content += line;
             }
             read.close();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return content;
	}
}
