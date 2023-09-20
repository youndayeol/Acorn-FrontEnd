package Swing;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class SwingList {
	
	
	JFrame f; //컨테이너
	JList<String> lList;
	
	public SwingList() {
		f = new JFrame("리스트 예제");
		
		DefaultListModel<String> dlm = new DefaultListModel<>();
		dlm.addElement("item1");
		dlm.addElement("item2");
		dlm.addElement("item3");
		dlm.addElement("item4");
		
		lList = new JList<String>(dlm);
		lList.setBounds(100, 30, 100, 80);
		
		
		f.add(lList);
		f.setLocation(100, 30); //팝업창 생성위치
		f.setSize(300, 500);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		new SwingList();
		
		
	}

}
