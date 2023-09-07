package addstudy;

public class Base {

	public void service(String state) {

		if(state.equals("낮"))
			day();
		else if(state.equals("오후"))
			afternoon();
		else
			night();
	}

	public void day() {
		System.out.println("낮에 일하고");
	}

	public void afternoon() {
		System.out.println("오후에도 일하고");
	}

	public void night() {
		System.out.println("밤에도 일하고");
	}

}
