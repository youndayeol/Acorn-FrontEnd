package Swing;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SwingArea01 {
	
	
	JFrame f; //컨테이너
	JTextArea taValue;
	
	public SwingArea01() {
		f = new JFrame("Text Form Example");
		
		taValue = new JTextArea("Text Area");
		taValue.setBounds(20, 20, 400, 250);
		
		
		
		f.add(taValue);
		
		f.setSize(500, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		
		new SwingArea01();
		
		
	}

}
