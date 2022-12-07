import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int h=0;h<t;h++)
        {
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[n1];
        int b1[]=new int[n+n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
            b1[i]=b[i];
        }
        int l=n1;
        for(int i=0;i<n;i++)
        {
            b1[l]=a[i];
            l+=1;
        }
        Arrays.sort(b1);
        for(int i=0;i<n+n1;i++)
        {
        if(i==(n+n1)-1)
        {
           System.out.print(b1[i]); 
           break;
        }
        System.out.print(b1[i]+" ");
        }
        System.out.println();
        }
    }
}