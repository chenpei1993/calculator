package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class calculator extends JFrame {
	JButton [] jb =new JButton[20];

	public calculator(String string) {
		// TODO Auto-generated constructor stub
		super.setTitle(string);
		JPanel jp =new JPanel();
		this.add(new Interface());
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator Calculator = new calculator("¼òµ¥¼ÆËãÆ÷");
		Calculator.setVisible(true);
		Calculator.setSize(400, 500);
		
		
	}
}
