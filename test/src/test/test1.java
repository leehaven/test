package test;

import java.io.FileWriter;
import java.io.IOException;

public class test1 {
	
	public static void main(String[] args) throws IOException
	{
		//�˴�����ļ������ڻ��Զ����������������Ḳ��
		FileWriter f = new FileWriter("DEMO.txt",true);
		/**
		 * �������е�Write();����������д�봴���õ��ļ���
		 * 
		 * */
		f.write("1 2");
		
		//�����ļ�������д
		f.write("3 4");
		/**
		 * ˢ������������д�뵽Ŀ���ļ���
		 * */
		//f.flush();
		/**
		 * �ر������ر���Դ���ڹر�ǰ���ȵ���flush(),��������ˢ�£�
		 * */
		f.close();
		/**
		 * flush��close������
		 * flush ()�൱�ڼ��±��еı��棬��close();���൱�ڼ��±��Ĺرգ�
		 * */
	}

}
