package Swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class SwingComboBox {
	
	
	JFrame f; //컨테이너
	JComboBox<String> cbName;
	
	public SwingComboBox() {
		f = new JFrame("ComboBox Example");
		
		String[] name = {"홍길동", "김길동", "박길동"};
		cbName = new JComboBox<String>(name);
		cbName.setBounds(30, 20, 90, 30);
		
		f.add(cbName);
		
		f.setLocation(100, 30); //팝업창 생성위치
		f.setSize(300, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		new SwingComboBox();
		
		
	}

}
