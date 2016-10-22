package xixueguishu;

import java.util.Arrays;

/**
 * 找出所有的四位吸血鬼数
 * 
 * */
public class xixueguishu {

	public static void main(String[] args) {
		
		method();
		
		
		
		System.out.println("南无阿弥陀佛");

	}
	public static void method(){
		int x, y ,val;
		for(x=10;x<100;x++){
			for ( y = 0; y < 100; y++) {
				val=x*y;
				if (999<val&val<10000) {
					
					String[] t1=(""+val).split("");
					Arrays.sort(t1);
					
					
					String[] t2=(""+x+y).split("");
					Arrays.sort(t2);
					
					if (Arrays.equals(t1, t2)) {
					System.out.println(x+"*"+y+"="+val);	
					}
					/*
					int a=val/1000;
					int b=(val-a*1000)/100;
					int c=(val-a*1000-b*100)/10;
					int d=(val-a*1000-b*100-c*10);
					
					int e=x/10;
					int f=x-10*e;
					
					int g=y/10;
					int h=x-10*g;
					*/
				}
			}
		}
		
	}
	/***
	 * 将吸血鬼数从高位开始取位
	 * */
	
}

//效率排序算法的实现


