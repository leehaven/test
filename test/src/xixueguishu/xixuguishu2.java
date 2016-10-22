package xixueguishu;

/**
 * 吸血鬼数避免群举的算法
 * */
public class xixuguishu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method0();
		System.out.println("南无阿弥陀佛");
		//System.out.println("1260, 1395, 1435, 1530, 1827, 2187, 6880, ");
	}	
	//处理数据
	public static void method0() { 
		// TODO Auto-generated method stub
		int count=0;//用于对吸血鬼数进行计数
		for (int x = 10; x <100; x++) {
			for (int y = x+1; y<100; y++) {//此处y=x+1可以避免双重群举
				int val=x*y;
				if(val>999&val<10000&(val%9==0)&(val%100!=0)){
					int[] s1=method1(val);
					int[] s2=method1(x+y*100);
					if (method4(s1,s2)) {
						count++;
					System.out.println("第"+count+"个吸血鬼数是"+val+";"+"    "+x+"*"+y+"="+val);
					}
				}
			}
		}
	}
	//将数字转换为整型数组
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

	//对数组进行排序
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
	//判断俩数组是否相等
	//算法优化
	public static boolean method4(int[] x,int[] y){
		int[] flag=new int[x.length];
		int t1=1;
		for (int i = 0; i < x.length; i++) {
			if (x[i]==y[i]) {
				flag[i]=1;
			}
		}
		//foreach循环
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





