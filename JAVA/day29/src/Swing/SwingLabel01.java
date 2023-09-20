package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingLabel01 {
	
	
	JFrame f; //컨테이너
	JLabel lblFirstName, lblMiddleInitial, lblLastName, lblAge;
	
	JTextField tflFirstName, tflMiddleInitial, tflLastName, tflAge;

	JButton btnClick;
	
	public SwingLabel01() {
		f = new JFrame("Text Form Example");
		
		lblFirstName =  new JLabel("First Name"); lblFirstName.setBounds(30, 30, 80, 50);
		tflFirstName = new JTextField(); tflFirstName.setBounds(120, 40, 200, 30); //x위치, y위치, 가로길이, 세로길이
		
		lblMiddleInitial = new JLabel("Middle Initial"); lblMiddleInitial.setBounds(30, 90, 80, 50);
		tflMiddleInitial = new JTextField(); tflMiddleInitial.setBounds(120, 100, 200, 30);
		
		lblLastName = new JLabel("Last Name"); lblLastName.setBounds(30, 150, 80, 50);
		tflLastName = new JTextField(); tflLastName.setBounds(120, 160, 200, 30);
		
		lblAge = new JLabel("Age"); lblAge.setBounds(30, 210, 40, 50);
		tflAge = new JTextField(); tflAge.setBounds(120, 220, 80, 30);
		
		btnClick = new JButton("클릭");
		btnClick.setBounds(120, 260, 150, 30);
		
		
		f.add(lblFirstName); f.add(lblMiddleInitial); f.add(lblLastName); f.add(lblAge);
		
		f.add(tflFirstName); f.add(tflMiddleInitial); f.add(tflLastName); f.add(tflAge);
		
		f.add(btnClick);
		
		f.setSize(500, 400); f.setLayout(null); f.setVisible(true);
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		new SwingLabel01();
		
		
	}

}
