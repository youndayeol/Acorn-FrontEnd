package study.acorn;

public class Car {

	//필드영역
	private String sManufacturer; //null
	private float fFuel; // 0.0 
	private float fSpeed;		// 0.0
	private int iRegistrationNum; //0
	private boolean bRunning;	// false 주행여부

	//생성자 영역
	public Car () {}
	
	public Car( String sManufacturer,
			float fFuel) {
		this.sManufacturer = sManufacturer;
		this.fFuel = fFuel;
	}

	//메소드 영역
	
	//Getters/Setters 영역
	public String getsManufacturer() { return sManufacturer;}
	public float getfFuel() { return fFuel;}
	public float getfSpeed() { return fSpeed;}
	public boolean getiRegistrationNum() { return bRunning;}
	
	
	
	//동적메소드영역
	public void SwitchOn() {
		bRunning = true;
	}

	public void SwitchOff() {
		bRunning = false;
	}

	public float accerlate() {
		// 속도 변화
		if(!bRunning) return 0.f;
		
//		fSpeed += 20;
//		fFuel -= 1.0;
//		
//		if(fSpeed >= 300) { fSpeed += 300;}
//		if(fFuel <0) { fFuel = 0.f; _break();}
		
		if(fSpeed >= 300) {
			fSpeed += 300;
		} else { fSpeed += 20;}
		
		
		if(fFuel > 0.f) {
			fFuel -= 1.0;
			if(fFuel < 0) {
				fFuel = 0.f;
				_break();
			}
			
		}
		return fFuel;
		
	}

	void _break() {
		// 속도 변화
		fSpeed = 0.f;
	}
}
