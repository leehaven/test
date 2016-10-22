package ≤‚ ‘;
/***
 * ≈≈–ÚÀ„∑®
 * */
public class ceshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();

	}

	private static void method() {
		
		int[] i = {6,4,9,1}; 
		for (int x = 0; x < 4; x++) {
			for (int y = x+1; y < 4; y++) {
				if(i[y]<i[x]){
					int temp=i[x];
					i[x]=i[y];
					i[y]=temp;
						
				}
			}
			
		}
		
		for(int a=0;a<4;a++){
			System.out.print(i[a]);}
	}

}
