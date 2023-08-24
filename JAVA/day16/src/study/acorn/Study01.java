package study.acorn;

public class Study01 {

	public static void main(String[] args) {
		int iHealth = 100;
		int iEffect = 0;
		int iCheckSound = 0;
		
		boolean bRet = makeHealthFull(iHealth); //startaPlay에 대해 include
		if(bRet) {
			startPlay();
			smashCar(1);
			playCrashAudio(iCheckSound);
		}
	}
	private static void playCrashudio(int iCheckSound) {
		if(iCheckSound == 1) {
			//오디오 플레이 로직
		}
	}

	private static void smashCar(int iType) {
		showCrashEffect(iType);
	}
	private static int showCrashEcffet(int iEffect) {
		if(iEffect == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	private static void startPlay() {
		
	}
	
	private static boolean makeHealthFull(int iHealth) {
		if(iHealth == 100) {
			return true;
		} else return false;
	}
}
