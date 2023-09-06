package study.homework02;

public class homework01 {

	public static void main(String[] args) {
//		영업준비업무
//		고객등록업무
//		귀중품 보관업무
//		각종 안내 및 메시지 관리
//		고객원장관리
//		환전업무
//		퇴숙업무
//		(재방문고객 과거자료랑 중복되지않게)
//		
//		
//		1. 고객 방문시 예약을 하지않고 방문입실 하는 경우에는 신규고객 등록카드 작성
//		1-1. 고객등록업무는 등록카드작성, 객실배정, 업셀링, 객실열쇠발급, 입실절차
//		단체입숙 절차
//		2. 등록카드 작성 절차
//			성명, 주소, 직업, 직장명, 국적, 여권번호, 전화번호, 출발일
//			여행목적, 서명
//			(그룹입실시 가이드명, 예치금 상태)
//		3. 고객이 오면 투숙하는 고객이 맞는지 예약번호를 확인 후 예약된 객실로 배정
//		4. vip고객을 위한 Welcome Card, VIP선물 등 제공
//		5. 그룹고객 확인 시 도착7일전 예약 재확인, 체크인시간 안내, 인솔자 연락
//			그룹고객은 가능한 같은층으로 배정.
//			그룹고객은 15객실마다 1객실을 무료로 제공
		String[] ArrName = new String[2];
		ArrName[0] = " AA ";
		ArrName[1] = " BB ";
		String[] ArrAddr = new String[2];
		ArrAddr[0] = " seoul ";
		ArrAddr[1] = " busan ";
		String[] ArrJob = new String[2];
		ArrJob[0] = " IT ";
		ArrJob[1] = " Math ";
		String[] ArrCompany = new String[2];
		ArrCompany[0] = " IT01 ";
		String sNation = " korea ";
		String sPass = " passport ";
		String sPhone = " 010-1234-5678 ";
		String sGuideName = " ABC ";
		int iMoney = 1000;
		int iRoomNum = 101;
		//과제2-1 프로그래밍언어로 저장 대상인 데이터 항목만 추출해 선언 및 초기화
		
		System.out.print(ArrName[0]);
		System.out.println(ArrAddr[0]);
		System.out.print(ArrJob[0]);
		System.out.println(ArrCompany[0]);
		System.out.println(sNation);
		System.out.println(sPass);
		System.out.println(sPhone);
		System.out.println(sGuideName);
		System.out.println(iMoney);
		System.out.println(iRoomNum);
		
		

			
		
		
		
	}

}
