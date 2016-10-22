package StringBuikder;

import java.io.File;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileTest();
	}

	private static void FileTest() {
		// TODO Auto-generated method stub
		//获取文件名称，路径，大小，修改时间
	
		//获取文件名称
		File f=new File("a.txt");//该名称是路径名名称序列中的最后一个名称
		System.out.println("文件名称："+f.getName());
		//获取文件大小
		Long size=f.length();
		System.out.println("文件大小："+size);
		//获取绝对路径
		String path = f.getAbsolutePath();
		System.out.println("文件绝对路径："+path);
		//获取对路径
		String path1= f.getPath();
		System.out.println("获取文件相对路径："+path1);
		//
		long time=f.lastModified();
		System.out.println("获取文件的最后修改时间："+time);
	}

}
