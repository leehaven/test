package StringBuikder;

import java.io.File;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest();
	}

	private static void FileTest() {
		// TODO Auto-generated method stub
		//��ȡ�ļ����ƣ�·������С���޸�ʱ��
	
		//��ȡ�ļ�����
		File f=new File("a.txt");//��������·�������������е����һ������
		System.out.println("�ļ����ƣ�"+f.getName());
		//��ȡ�ļ���С
		Long size=f.length();
		System.out.println("�ļ���С��"+size);
		//��ȡ����·��
		String path = f.getAbsolutePath();
		System.out.println("�ļ�����·����"+path);
		//��ȡ��·��
		String path1= f.getPath();
		System.out.println("��ȡ�ļ����·����"+path1);
		//
		long time=f.lastModified();
		System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+time);
	}

}
