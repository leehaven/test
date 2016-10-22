package BufferTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("buf.txt");
		//创建缓冲区对象，并且和指定的缓冲流对象关联
		BufferedWriter bw = new BufferedWriter(fw);
		for(int x =0;x<=4;x++){
			bw.write("这是第"+x+"个数据");
			bw.newLine();
		}
		
		bw.write("南无阿弥陀佛");
		bw.newLine();
		bw.write("南无阿弥陀佛");
		bw.flush();
		//关闭缓冲区，其实关闭的就是缓冲的流对象
		bw.close();
		System.out.println("南无阿弥陀佛");
	}

}
