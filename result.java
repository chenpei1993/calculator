package calculator;

import javax.swing.JTextArea;

public class result {
	static String resultstr ;
	public static String getresult(String str) {
		// TODO Auto-generated constructor stub
	
		System.out.println("��ʽ"+str);
		int count=0;
		int a=0;
		int b=0;
		int counttemp=0;
		int strLenth = str.length();
		System.out.println("�ַ�������"+strLenth);
		for(int i=0;i<strLenth;i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='*')
			{
				count++;
			}
		}
		System.out.println("���������"+count);
		
		String [] str1 =new String [count+1];//str1���鴢�� �ֶ�����
		char [] temp = new char[count +1];//����������ַ���
		for(int i=0;i<strLenth;i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='/'||str.charAt(i)=='*')
			{
				temp[counttemp]=str.charAt(i);
				str1[a]=(String) str.substring(b, i);
				System.out.println("������"+str1[a]);
				counttemp++;
				a++;
				b=i+1;
			}
		}
		str1[a]=str.substring(b);
		System.out.println(str1[a]);

		//�˳�����
		for(int i=0;i<counttemp;i++){
			if(temp[i]=='/')
			{
				float num ;
				num=Float.parseFloat(str1[i])/Float.parseFloat(str1[i+1]);
				str1[i+1]=String.valueOf(num);
				System.out.println("����������� "+str1[i]);
				str1[i]="0";
			}
		}
		
		for(int i=0;i<counttemp;i++){
			if(temp[i]=='*')
			{	
					float num ;
					num=Float.parseFloat(str1[i])*Float.parseFloat(str1[i+1]);
					str1[i+1]=String.valueOf(num);
					System.out.println("�˷���Ľ��"+str1[i]);
					str1[i]="0";
			}
		}

		//����
		for(int i=0;i<counttemp;i++){
			if(temp[i]=='-')
			{
				float num ;
				
				num=-Float.parseFloat(str1[i+1]);
				str1[i+1]=String.valueOf(num);
				System.out.println("������Ľ��"+str1[i+1]);
			}
		}
		
		float result=0;
		for(int i=0; i<count+1;i++){
			System.out.println(str1[i]);
			result =result+Float.parseFloat(str1[i]);
		}
		System.out.println("���"+result);
		resultstr="="+String.valueOf(result);
		return resultstr;
	}
	
	
}
