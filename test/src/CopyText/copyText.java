package CopyText;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copyText {

 	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter fw1= new FileWriter("1.txt");
		fw1.write("ni hao shi jie ");
		fw1.close();
		
		//1.��ȡһ�����е��ļ���ʹ���ַ���ȡ�����ļ������
		FileReader fr = new FileReader("1.txt");
		//2.����һ��Ŀ�����ڴ洢����
		FileWriter fw2 = new FileWriter("2.txt");
	
		//3.Ƶ���Ķ�д����
		int ch = 0;
		while ((ch=fr.read())!=-1){
			fw2.write(ch);
		}
		//4.�ر�����Դ
		fw2.close();
		fr.close();
	}
}
