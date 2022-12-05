import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=1,c=1,l=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1] && k==1)
            {
                c=1;
                k=0;
            }
            else if(a[i]>a[i+1] && c==1)
            {
                k=1;
                c=0;
            }
            else
            {
                l=1;
                System.out.println("no");
                break;
            }
        }
        if(l==0)
        {
            System.out.println("yes");
        }
    }
}