import java.util.Scanner;
class J
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,a,b,c,d;
        float c1,c2;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            c1=(float)c/a;
            c2=(float)d/b;
           
            if(c1==c2)
            {
                System.out.println(0);
            }
            else if(c1<c2)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(1);
            }
        }
    }
}