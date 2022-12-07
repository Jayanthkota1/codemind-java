import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int s=0,l=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==t)
            {
                if(c==1)
                {
                    l=i;
                    break;
                }
                s=i;
                c=1;
            }
        }
        if(c==0)
        {
            System.out.println("-1"+" "+"-1");
        }
        else
        {
            System.out.println(s+" "+l);
        }
    }
}