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
        for(int i=1;i<=n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[j]==i)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}