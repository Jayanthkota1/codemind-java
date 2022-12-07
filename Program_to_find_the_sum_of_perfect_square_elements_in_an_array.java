import java.util.*;
class J
{
    public static int pe(int n)
    {
        for(int i=1;i<=Math.sqrt(n)+1;i++)
        {
            if(Math.pow(i,2)==n)
            {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(pe(a[i])==1)
            {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}