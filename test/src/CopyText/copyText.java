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
		
		//1.读取一个已有的文件，使用字符读取流和文件相关联
		FileReader fr = new FileReader("1.txt");
		//2.创建一个目的用于存储数据
		FileWriter fw2 = new FileWriter("2.txt");
	
		//3.频繁的读写操作
		int ch = 0;
		while ((ch=fr.read())!=-1){
			fw2.write(ch);
		}
		//4.关闭流资源
		fw2.close();
		fr.close();
	}
}
