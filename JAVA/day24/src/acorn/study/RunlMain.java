package acorn.study;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class RunlMain {
	

	public static void main(String[] args) throws IOException {
		//스트림생성:File
//		File objFile = new File("tablelikedata.txt");
		
		//스트림 연결 // FileReader
//		FileReader objFr = new FileReader(objFile);
		
		//스트림 버퍼화: bufferdReader
		BufferedReader br = new BufferedReader(
				new FileReader(new File("tablelikedata.txt")));
		
		//BufferedReader 의 객체가 사용할수있는 내부메소드 : readLine
		//leadLine != null
		String oneLine = null;
		int iLineType= 0; //0:타이틀 1:데이터
		while((oneLine = br.readLine()) != null) {
			if(oneLine.startsWith("Title")) {
				iLineType = 0;
			} else if(oneLine.startsWith("Data")) {
				iLineType = 1;
			}
		}
			String[] sSplitVal = oneLine.split("#");
			
			
		}
	}

