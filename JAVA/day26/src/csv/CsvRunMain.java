package csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvRunMain implements CsvFilePath {

	public static void main(String[] args) throws IOException {		
		// 파일 읽기 처리
		File file = new File(fInSalesGoods);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		String sColunmHeader = "INSERT INTO insalesgoods(";
		String sColumValues = "VALUES(";
		
		// INSERT 문장을 담기 위한 동적 배열
		ArrayList<String> al = new ArrayList<>();
			
		// 라인 저장 변수
		String oneLine = null;
		int iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {0, 1, 1, 1, 0};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();
		
		// 파일 읽기 처리
		file = new File(fOrderGoods);
		fr = new FileReader(file);
		br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		sColunmHeader = "INSERT INTO ordergoods(";
		sColumValues = "VALUES(";
				
		// 라인 저장 변수
		oneLine = null;
		iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {0, 1, 1, 1, 0, 1};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();		
		
		// 파일 읽기 처리
		file = new File(fRawMat);
		fr = new FileReader(file);
		br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		sColunmHeader = "INSERT INTO rawmaterial(";
		sColumValues = "VALUES(";
				
		// 라인 저장 변수
		oneLine = null;
		iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {1, 1, 1};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();	
		
		// 파일 읽기 처리
		file = new File(fOrderInfo);
		fr = new FileReader(file);
		br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		sColunmHeader = "INSERT INTO orderinfo(";
		sColumValues = "VALUES(";
				
		// 라인 저장 변수
		oneLine = null;
		iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {1, 0, 1};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();	
		
		// 파일 읽기 처리
		file = new File(fSalesInfo);
		fr = new FileReader(file);
		br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		sColunmHeader = "INSERT INTO salesinfo(";
		sColumValues = "VALUES(";
				
		// 라인 저장 변수
		oneLine = null;
		iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {1, 0};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();	
		
		// 파일 읽기 처리
		file = new File(fStockInfo);
		fr = new FileReader(file);
		br = new BufferedReader(fr);

		// 컬럼헤더/컬럼값 고정값
		sColunmHeader = "INSERT INTO stockinfo(";
		sColumValues = "VALUES(";
				
		// 라인 저장 변수
		oneLine = null;
		iLoopIdx = 1;
		while((oneLine = br.readLine()) != null) {
			if(iLoopIdx == 1) {
				// 헤더 처리 부분
				sColunmHeader += oneLine + ") ";
			} else {
				// 데이터 처리 부분
				String[] sArr = oneLine.split(",");
				int[] iTypeArr = {1, 0};
				String sRet = makeValues(iTypeArr, sArr, sColumValues);
				al.add(sColunmHeader + sRet);
			}
			
			iLoopIdx++;
		}
		br.close();
		fr.close();	
		
		// 파일 쓰기
		File fw = new File(fInsertScript);
		FileWriter fwr = new FileWriter(fw);
		for(String str : al) {
			fwr.write(str + "\n");
		}
		
		fwr.write("COMMIT;" + "\n");
		fwr.close();
	}

	private static String makeValues(int[] iTypeArr, 
			String[] sArr, String sColumValues) {
		for(int i = 0; i < sArr.length; i++) {
			if(iTypeArr[i] == 0) {
				sColumValues += sArr[i] + ",";
			} else {
				sColumValues += "'" + sArr[i] + "'" + ",";
			}
		}
		
		sColumValues = 
				sColumValues.substring(0, sColumValues.length() - 1);
		
		sColumValues += ");";
		
		return sColumValues;
	}		
}
