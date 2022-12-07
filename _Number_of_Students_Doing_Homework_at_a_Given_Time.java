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
        int n1=sc.nextInt();
        int b[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=t && b[i]>=t)
            {
                k+=1;
            }
        }
            System.out.println(k);
    }
}