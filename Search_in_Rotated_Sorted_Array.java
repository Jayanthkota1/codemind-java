import java.util.*;
class j
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
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==t)
            {
                k=1;
                System.out.println(i);
                break;
            }
        }
        if(k==0)
        {
            System.out.println("-1");
        }
    }
}