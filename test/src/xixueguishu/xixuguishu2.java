package xixueguishu;

/**
 * ��Ѫ��������Ⱥ�ٵ��㷨
 * */
public class xixuguishu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method0();
		System.out.println("���ް����ӷ�");
		//System.out.println("1260, 1395, 1435, 1530, 1827, 2187, 6880, ");
	}	
	//��������
	public static void method0() { 
		// TODO Auto-generated method stub
		int count=0;//���ڶ���Ѫ�������м���
		for (int x = 10; x <100; x++) {
			for (int y = x+1; y<100; y++) {//�˴�y=x+1���Ա���˫��Ⱥ��
				int val=x*y;
				if(val>999&val<10000&(val%9==0)&(val%100!=0)){
					int[] s1=method1(val);
					int[] s2=method1(x+y*100);
					if (method4(s1,s2)) {
						count++;
					System.out.println("��"+count+"����Ѫ������"+val+";"+"    "+x+"*"+y+"="+val);
					}
				}
			}
		}
	}
	//������ת��Ϊ��������
	public static int[] method1(int val){
		int[] t1=new int[4];
		int a=val/1000;
		int b=val%1000/100;
		int c=val%100/10;
		int d=val%10;
		t1[0]=a;
		t1[1]=b;
		t1[2]=c;
		t1[3]=d;
		method3(t1);
		return  t1;
	}

	//�������������
	public static int[] method3(int[] i){
		
		for (int x = 0; x < i.length; x++) {
			for (int y = x+1; y < i.length; y++) {
				if(i[y]<i[x]){
					int temp=i[x];
					i[x]=i[y];
					i[y]=temp;			
				}
			}	
		}
		return i;
	}
	//�ж��������Ƿ����
	//�㷨�Ż�
	public static boolean method4(int[] x,int[] y){
		int[] flag=new int[x.length];
		int t1=1;
		for (int i = 0; i < x.length; i++) {
			if (x[i]==y[i]) {
				flag[i]=1;
			}
		}
		//foreachѭ��
		for(int f: flag){
			if(f!=1)
		t1=0;		
		}
		if(t1==1)
			return true;
		else 
			return false;
	}
}





