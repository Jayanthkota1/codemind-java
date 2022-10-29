import java.util.*;
class J
{
    public static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n,l=0;
            n=sc.nextInt();
            for(int j=2;j<n/2;j++)
            {
              if(isprime(j))
               {
                for(int k=j+1;k<n;k++)
                {
                 if(isprime(k))
                 {
                   if(j*k==n)
                   {
                       l=1;
                       System.out.println("YES");
                   }
                 }
                }
               }
            }
            if(l==0)
            {
                System.out.println("NO");
            }
        }
    }
}