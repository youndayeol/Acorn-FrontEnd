package hunter.test;

import com.common.Location;
import com.hunter.HunterImpl;

//데이터보안(Data encapsulation)/상속(inheritance)/다형성(polymorphism)
public class HunterImplTest {

	public static void main(String[] args) {
		HunterImpl hunterImpl = new HunterImpl();
		
		hunterImpl.wake(100);
		
		hunterImpl = new HunterImpl(100, 20, 10, 5000, 200);
		hunterImpl.setSpeed(200);
		
		Location location = new Location(10, 10);
		hunterImpl = new HunterImpl(100, 20, 10, 5000, 200, location);
		
		System.out.println(hunterImpl.location.getX() + ", " + hunterImpl.location.getY());
		
		
	}

}
