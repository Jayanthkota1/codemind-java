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
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(a[i]==a[j])
               {
                   c=1;
                  System.out.println(a[i]);
                  break;
               }
            }
            if(c==1)
            {
                break;
            }
        }
    }
}