package study.class01;

public class Student {
		//속성 또는 필드 영역
		String sEntryNumber;
		String sName;
		String sAddress;
		
		//메소드 영역 : 대부분 public
		//생성자 영역
		//기본(default) 생성자
		public Student()
		{
			
		}


		//getter/setter메소드 영역
		public String getsEntryNumber() {
			return sEntryNumber;
		}

		public void setsEntryNumber(String sEntryNumber) {
			this.sEntryNumber = sEntryNumber;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}

		public String getsAddress() {
			return sAddress;
		}

		public void setsAddress(String sAddress) {
			this.sAddress = sAddress;
		}
		
		
		
		//오버라이딩 메소드 영역
		
		
		//사용자 정의 메소드 영역
		//정적 메소드(클래스 메소드)static이 붙은 것
		
		
		
		//동적 메소드(인스턴스 메소드, 객체 메소드)static이 없는 것
		
		

	}


