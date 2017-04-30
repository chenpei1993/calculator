/*
 * Programm: 
 * The Autor: Chen Pei Date 31/7/2016
	version 2.0
*/
package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Interface extends JPanel implements ActionListener{
	JButton [] jb =new JButton[20];
	JTextArea jta;  //TextArea shows formula
	JTextArea jta2; //TextArea shows result
	String CalResult=" ";
	Interface(){
		
		//显示公式
		JPanel jp1=new JPanel();
		jta = new JTextArea();
		jta.setSize(400,100);
		jp1.add(jta);
		
		//显示结果
		JPanel jp3=new JPanel();
		jta2 = new JTextArea();
		jta2.setSize(400, 100);
		//jta2.setText("CalResult World");
		jp3.add(jta2);
		
		//显示按键
		JPanel jp2=new JPanel();
		jp2.setSize(400, 300);
		jp2.setLayout(new GridLayout(5,4));
		String [] str = {" sd","C","Del","/",
						 "7","8","9","*",
						 "4","5","6","+",
						 "1","2","3","-",
						 "+/-","0",".","="};
		System.out.println("OK");
	
		for(int i =0;i<20;i++){
			jb[i]=new JButton(str[i]);
			jb[i].addActionListener(this);
			jp2.add(jb[i]);
		}
		
		//添加到容器中
		this.setLayout(new BorderLayout());
		this.add(jp1,"North");
		this.add(jp2, "Center");
		this.add(jp2,"South");
		
	}
	
	//添加事件处理
	String string = new String();
	int num1=0;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i =3; i<19;i++){
			if((JButton)e.getSource()==jb[i]){
				if((JButton)e.getSource()==jb[16]){
					String str1="-";
					string = str1 +string;
				}else{
				String str1 =jb[i].getText();
				string = string + str1;
				}
				System.out.println(string);	
				break;
			}
		}
			if((JButton)e.getSource()==jb[19]){
				CalResult = result.getresult(string);
				System.out.println(CalResult);
			}
			
			//Clear 功能
			if((JButton)e.getSource()==jb[1]){
				string="";
				CalResult="";
			}
			
			//删除 功能
			if((JButton)e.getSource()==jb[2]){
				if(CalResult==""){
					int strLength=string.length();
					string=string.substring(0, strLength-1);
				}else{
					
				}
				
				
				
				
			}
		
		jta.setText(string);
		jta.append(CalResult);
	
	}
}
