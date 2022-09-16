import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d,r=0,t,s=0,s1=0,k;
        a=sc.nextInt();
        for(int i=a-1;i>=1;i--)
        {
          r=0;
          t=i;
          k=i;
          while(k>0)
          {
            d=k%10;
            r=r*10+d;
            k=k/10;
          }
          if(r==t)
          {
           s=r;
           break;
          }
        }
        for(int i=a+1;i<a+10000;i++)
        {
          r=0;
          t=i;
          k=i;
          while(k>0)
          {
            d=k%10;
            r=r*10+d;
            k=k/10;
          }
          if(r==t)
          {
           s1=r;
           break;
          }
        }
        if(a-s == s1-a)
        {
            System.out.println(s+" "+s1);
        }
        else if(a-s < s1-a)
        {
            System.out.println(s);
        }
        else
        {
            System.out.println(s1);
        }
    }
}