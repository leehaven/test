package xixueguishu;


class Test10
{
    public static void main(String[] args)
    {
        //long start = System.currentTimeMillis();
        int i=1000;
        for(;i<10000;i++)
        {
            if(i%100==0)
            {
                continue;
            }
            int first=i/1000;
            int sec=i%1000/100;
            int third=i%100/10;
            int four=i%10;
            int num1=0;
            int num2=0;
            for(int j=0;j<4;j++)
            {
                switch(j)
                {
                    case 0:num1=first*10;break;
                    case 1:num1=sec*10;break;
                    case 2:num1=third*10;break;
                    case 3:num1=four*10;break;
                }
                int tempNum1=num1;
                for(int k=0;k<4;k++)
                {
                    if(k==j)
                    {
                        continue;
                    }
                    switch(k)
                    {
                        case 0:num1=tempNum1+first;break;
                        case 1:num1=tempNum1+sec;break;
                        case 2:num1=tempNum1+third;break;
                        case 3:num1=tempNum1+four;break;
                    }
                    for(int l=0;l<4;l++)
                    {
                         
                        if(l==j||l==k)
                        {
                            continue;
                        }
                        switch(l)
                        {
                            case 0:num2=first*10;break;
                            case 1:num2=sec*10;break;
                            case 2:num2=third*10;break;
                            case 3:num2=four*10;break;
                        }
                        int tempNum2=num2;
                        for(int m=0;m<4;m++)
                        {
                            if(m==j||m==k||m==l)
                            {
                                continue;
                            }
                            switch(m)
                            {
                                case 0:num2=tempNum2+first;break;
                                case 1:num2=tempNum2+sec;break;
                                case 2:num2=tempNum2+third;break;
                                case 3:num2=tempNum2+four;break;
                            }
                        }
                    }
                }
                if(num1*num2==i)
                {
                    System.out.println("i="+i+";"+i+"="+num1+"*"+num2);
                    break;
                }
            }           
        }
        //long end = System.currentTimeMillis();
        //System.out.println("程序开始时间为："+start+",程序结束时间为："+end+"，程序运行时间为："+(end-start));
    }
}