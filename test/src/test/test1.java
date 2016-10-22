package test;

import java.io.FileWriter;
import java.io.IOException;

public class test1 {
	
	public static void main(String[] args) throws IOException
	{
		//此处如果文件不存在会自动创建，如果存在则会覆盖
		FileWriter f = new FileWriter("DEMO.txt",true);
		/**
		 * 调用其中的Write();方法将数据写入创建好的文件中
		 * 
		 * */
		f.write("1 2");
		
		//进行文件内容续写
		f.write("3 4");
		/**
		 * 刷新流，将数据写入到目的文件中
		 * */
		//f.flush();
		/**
		 * 关闭流，关闭资源，在关闭前会先调用flush(),进行数据刷新；
		 * */
		f.close();
		/**
		 * flush与close的区别
		 * flush ()相当于记事本中的保存，而close();就相当于记事本的关闭；
		 * */
	}

}
