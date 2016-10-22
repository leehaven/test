package keyRead;

import java.io.IOException;
import java.io.InputStream;

public class keyRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//ReadKey();
		ReadKey1();
	}
	private static void ReadKey1() throws IOException {
		// TODO Auto-generated method stub
		//创建标准输入流
		InputStream in=System.in;
		int ch=0;
		while ((ch=in.read())!=-1) {
			System.out.println(ch);
			
		}
	}
	/*public static void ReadKey() throws IOException{
		InputStream in =System.in;
		int ch=in.read();
		System.out.println(ch);
	}
	*/

}
