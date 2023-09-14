package com.study;

import java.util.ArrayList;

public class FileClient {

	public static void main(String[] args) {
		String fName = "C:/Users/D/Desktop/git/Acron/JAVA/day27/src/com/study/데이터정보저장.txt";
		
		
		String searchWord = "서울";
		
		FileDriver fdr = new FileDriverImp();
		ArrayList<String> aStrList = fdr.fileOpen(fName);
		String sRet = fdr.searchContents(aStrList, searchWord);
		System.out.println(sRet);
	}

}
