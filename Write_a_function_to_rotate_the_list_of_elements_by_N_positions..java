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
        int b=sc.nextInt();
        for(int j=0;j<b;j++)
        {
            int temp=a[n-1];
            for(int i=n-1;i>0;i--) 
            {
                a[i]=a[i-1]; 
            }
            a[0]=temp;
        }
         for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }

    }
}