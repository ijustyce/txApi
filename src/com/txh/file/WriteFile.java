package com.txh.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	/**
	 * 写入内容到文本文件
	 * @param filePath 文本文件的存放路径
	 * @param content 你要写入的内容
	 * @return 如果写入成功返回true，否则，返回false
	 */
	public boolean writeFile(String filePath , String content){
		
		boolean success = true;
		
		try{
			File f = new File(filePath);
			if(!f.exists()){
				f.createNewFile();
				BufferedWriter out = new BufferedWriter(new FileWriter(f));
				out.write(content);
				out.flush(); 
				out.close();
			}
		}catch(IOException e){
			success = false;
		}
		
		return success;
	}
}
