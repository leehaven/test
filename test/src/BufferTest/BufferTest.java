package BufferTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("buf.txt");
		//�������������󣬲��Һ�ָ���Ļ������������
		BufferedWriter bw = new BufferedWriter(fw);
		for(int x =0;x<=4;x++){
			bw.write("���ǵ�"+x+"������");
			bw.newLine();
		}
		
		bw.write("���ް����ӷ�");
		bw.newLine();
		bw.write("���ް����ӷ�");
		bw.flush();
		//�رջ���������ʵ�رյľ��ǻ����������
		bw.close();
		System.out.println("���ް����ӷ�");
	}

}
