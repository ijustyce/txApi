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
	 * 读取文本文档，并返回文本内容
	 * @param filePath 文本文档的路径 
	 * @param encoding 文本编码，比如：gbk，utf-8
	 * @return 文档内容
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
