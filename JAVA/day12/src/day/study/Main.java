package day.study;

public class Main {

	public static void main(String[] args) {
		Audio objAudio = new Audio(true, 15);
		TV objTV = new TV(false, 12, 40);
		
		objTV.setPower(true);
		objTV.watch();
		
		objAudio.setVolumn(10);
		objAudio.tune();
		
	}
}
