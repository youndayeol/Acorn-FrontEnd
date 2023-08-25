package study.acorn;

import study.acorn.Car;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("hyundai", 20.5f);
		
		System.out.println(car.getsManufacturer());
		System.out.println(car.getfFuel());
		
		//시동켜기
		car.SwitchOn();
		//차량 구동
		car.accerlate();
		//가속페달 밟기
		car.getfSpeed();
		//차량 속도 알아내기
		car.getfFuel();
		//차량 연료량 알아내기
		car.accerlate();
		//가속 페달밟기
		car.getfSpeed();
		//차량 속도 알아내기
		car.getfFuel();
		//차량 연료량 알아내기
		car._break();
		//차량 브레이크 밟기
		car.SwitchOff();
		
		
		
	}

}
