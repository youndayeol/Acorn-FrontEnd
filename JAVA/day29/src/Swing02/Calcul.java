package Swing02;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;




public class Calcul {

	private JFrame f;
	private JPanel controlPanel;

	private JTextField tfResult;

	private JButton btnNum00, btnNum01, btnNum02, btnNum03, btnNum04, btnNum05;
	private JButton btnNum06, btnNum07, btnNum08, btnNum09;

	private JButton btnOperatoradd, btnOperatorsub, btnOperatormul, btnOperatordiv;

	private JButton btnClear;
	private JButton btnCommandRun;

	private JTextField inputSpace; 
	//계산식의 숫자를 담을 변수num
	private String num = ""; 
	//방금 누른 버튼을 기억하는 변수
	private String prev_operation = "";
	//계산기능을 구현하기 위해 ArrayList에 숫자와 연산기호를 하나씩 구분해 담음
	private ArrayList<String> equation = new ArrayList<String>();

	public Calcul() {
		f = new JFrame("계산기");
		f.setSize(300,380);
		f.setLayout(null);

		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setBackground(Color.WHITE);
		tfResult.setBounds(8, 10, 270, 40);





		controlPanel = new JPanel();
		controlPanel.setLayout(new GridLayout(4, 4, 10, 10));
		controlPanel.setBounds(8, 70, 270, 250);

		btnClear = new JButton("C");
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		btnOperatordiv = new JButton("/");
		btnOperatordiv.setBackground(Color.GRAY);
		btnOperatordiv.setForeground(Color.WHITE);
		btnOperatormul = new JButton("x");
		btnOperatormul.setBackground(Color.GRAY);
		btnOperatormul.setForeground(Color.WHITE);
		btnCommandRun = new JButton("=");
		btnCommandRun.setBackground(Color.GRAY);
		btnCommandRun.setForeground(Color.WHITE);

		btnNum07 = new JButton("7");
		btnNum07.setBackground(Color.BLACK);
		btnNum07.setForeground(Color.WHITE);
		btnNum08 = new JButton("8");
		btnNum08.setBackground(Color.BLACK);
		btnNum08.setForeground(Color.WHITE);
		btnNum09 = new JButton("9");
		btnNum09.setBackground(Color.BLACK);
		btnNum09.setForeground(Color.WHITE);
		btnOperatoradd = new JButton("+");
		btnOperatoradd.setBackground(Color.GRAY);
		btnOperatoradd.setForeground(Color.WHITE);

		btnNum04 = new JButton("4");
		btnNum04.setBackground(Color.BLACK);
		btnNum04.setForeground(Color.WHITE);
		btnNum05 = new JButton("5");
		btnNum05.setBackground(Color.BLACK);
		btnNum05.setForeground(Color.WHITE);
		btnNum06 = new JButton("6");
		btnNum06.setBackground(Color.BLACK);
		btnNum06.setForeground(Color.WHITE);
		btnOperatorsub = new JButton("-");
		btnOperatorsub.setBackground(Color.GRAY);
		btnOperatorsub.setForeground(Color.WHITE);

		btnNum01 = new JButton("1");
		btnNum01.setBackground(Color.BLACK);
		btnNum01.setForeground(Color.WHITE);
		btnNum02 = new JButton("2");
		btnNum02.setBackground(Color.BLACK);
		btnNum02.setForeground(Color.WHITE);
		btnNum03 = new JButton("3");
		btnNum03.setBackground(Color.BLACK);
		btnNum03.setForeground(Color.WHITE);
		btnNum00 = new JButton("0");
		btnNum00.setBackground(Color.GRAY);
		btnNum00.setForeground(Color.WHITE);

		controlPanel.add(btnClear);
		controlPanel.add(btnOperatordiv);
		controlPanel.add(btnOperatormul);
		controlPanel.add(btnCommandRun);
		controlPanel.add(btnNum07);
		controlPanel.add(btnNum08);
		controlPanel.add(btnNum09);
		controlPanel.add(btnOperatoradd);
		controlPanel.add(btnNum04);
		controlPanel.add(btnNum05);
		controlPanel.add(btnNum06);
		controlPanel.add(btnOperatorsub);
		controlPanel.add(btnNum01);
		controlPanel.add(btnNum02);
		controlPanel.add(btnNum03);
		controlPanel.add(btnNum00);

		f.add(tfResult);
		f.add(controlPanel);
		f.setResizable(false);
		f.setVisible(true); 
	}

	class PadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();

			if(operation.equals("C")) {
				inputSpace.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			} else if (operation.equals("+") || operation.equals("-") || operation.equals("x") || operation.equals("/")) {
				if(inputSpace.getText().equals("") && operation.equals("-")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				} else if (!inputSpace.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("x") && !prev_operation.equals("/")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
				}
			}
			else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());
			}
			prev_operation = e.getActionCommand();
		}
	}

	private void fullTextParsing(String inputText) {
		equation.clear();

		for(int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);

			if(ch == '-' || ch == '+' || ch == 'x' || ch == '/') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
		equation.remove("");
	}

	public double calculate(String inputText) {
		fullTextParsing(inputText);

		double prev = 0;
		double current = 0;

		String mode = "";

		for(int i = 0; i < equation.size(); i++) {
			String s = equation.get(i);

			if(s.equals("+")) {
				mode = "add";
			}else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("x")) {
				mode = "mul";
			} else if (s.equals("/")) {
				mode = "div";
			}else {
				if((mode.equals("mul") || mode.equals("div")) && !s.equals("+") && !s.equals("-") && !s.equals("x") && !s.equals("/")) {
					Double one = Double.parseDouble(equation.get(i - 2));
					Double two = Double.parseDouble(equation.get(i));
					Double result = 0.0;

					if(mode.equals("mul")) {
						result = one * two;
					}else if (mode.equals("div")) {
						result = one / two;
					}
					equation.add(i + 1, Double.toString(result));

					for(int j = 0; j < 3; j++) {
						equation.remove(i - 2);
					}
					i -= 2;
				}
			}
		}

		for(String s : equation) {
			if(s.equals("+")) {
				mode = "add";
			}else if (s.equals("-")) {
				mode = "sub";
			}else {
				current = Double.parseDouble(s);
				if(mode.equals("add")) {
					prev += current;
				}else if (mode.equals("sub")) {
					prev -= current;
				} else {
					prev = current;
				}
			}
			prev = Math.round(prev * 100000) / 100000.0;
		}
		return prev;
	}


	public static void main(String[] args) {
		new Calcul();
	}

}
