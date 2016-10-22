package 测试;

import java.util.Arrays;

public class ceshi2 {
 
     public static void main(String[] args) {
         for(int i = 10; i <= 99; i++){
             for(int j = i+1; j<= 99; j++){  //此处 j=i+1可以避免双重群举
                int sun = i*j;
                if(sun >=1000 && sun <= 9999){
                    String [] str = String.valueOf(sun).split("");
                    Arrays.sort(str);    //按照字符的升序排列
                    String [] str1 =(String.valueOf(i)+String.valueOf(j)).split("");
                    Arrays.sort(str1);    //对两个Arrays进行比较
                    if(Arrays.equals(str, str1)){
                        System.out.println(i+"*"+j+"="+i*j);
                    }
                }
            }
        }

    }

}
