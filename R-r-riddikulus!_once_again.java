import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int j=0;j<b;j++)
        {
            int temp=a[0];
            for(int i=1;i<n;i++)
            {
                a[i-1]=a[i];
            }
            a[n-1]=temp;
        }
         for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
    }
}