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
        for(int i=0;i<n-1;i+=2)
        {
            for(int j=0;j<a[i];j++)
            {
                System.out.print(a[i+1]+" ");
            }
        }
    }
}