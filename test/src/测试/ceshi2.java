package ����;

import java.util.Arrays;

public class ceshi2 {
 
     public static void main(String[] args) {
         for(int i = 10; i <= 99; i++){
             for(int j = i+1; j<= 99; j++){  //�˴� j=i+1���Ա���˫��Ⱥ��
                int sun = i*j;
                if(sun >=1000 && sun <= 9999){
                    String [] str = String.valueOf(sun).split("");
                    Arrays.sort(str);    //�����ַ�����������
                    String [] str1 =(String.valueOf(i)+String.valueOf(j)).split("");
                    Arrays.sort(str1);    //������Arrays���бȽ�
                    if(Arrays.equals(str, str1)){
                        System.out.println(i+"*"+j+"="+i*j);
                    }
                }
            }
        }

    }

}
