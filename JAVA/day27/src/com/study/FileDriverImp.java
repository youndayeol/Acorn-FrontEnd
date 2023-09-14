package com.study;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileDriverImp implements FileDriver {
	
	@Override
	public ArrayList<String> fileOpen(String path) {
		//파일객체생성 - 파일스트림 완성
		File file = new File(path);
		FileReader fr = null;
		BufferedReader br = null;
		ArrayList<String> sArrList = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new FileReader(new File(path)));
		//파일조작 객체 생성
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			//파일 읽거나 쓰기
			String oneLine = null;
			while((oneLine = br.readLine()) != null) {
				sArrList.add(oneLine);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//파일종료
		return sArrList;
	}
	
	@Override
	public String searchContents(ArrayList<String> sArrList, String searchword) {
		String sRet = null;
		ArrayList<String> sArrList = fileOpen(filename);
		String matchLine = searchContents(sArrList, searchword);
		return matchLine;
		}
	}
}
