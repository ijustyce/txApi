package com.txh.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	
	/**
	 * д�����ݵ��ı��ļ�
	 * @param filePath �ı��ļ��Ĵ��·��
	 * @param content ��Ҫд�������
	 * @return ���д��ɹ�����true�����򣬷���false
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
