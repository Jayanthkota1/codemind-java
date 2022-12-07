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
        int s=1;
        for(int i=0;i<n;i++)
        {
             s=1;
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                s=s*a[j];
            }
            System.out.print(s+" ");
        }
    }
}