package com.study;

import java.util.ArrayList;

public class RunMain {

	public static void main(String[] args) {
		String fName = "C:/Users/D/Desktop/git/Acron/JAVA/day27-2/src/com/fsearchClient/데이터정보저장.txt";
		
		FileDriver fdr = new FileDriverImp();
		String sTarget = fdr.searchContents(fName, "서울");
		System.out.println(sTarget);
	}

}
