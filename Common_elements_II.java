import java.util.*;
class J
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        int n1=sc.nextInt();
        int a[]=new int[n];
        int a1[]=new int[n1];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==-1)
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<n1;i++)
        {
            if(a1[i]==-1)
            {
                continue;
            }
            for(int j=i+1;j<n1;j++)
            {
                if(a1[i]==a1[j])
                {
                    a1[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            int c=0;
            if(a[i]==-1)
            {
                continue;
            }
            for(int j=0;j<n1;j++)
            {
                if(a[i]==a1[j])
                {
                    c+=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print(a[i]+" ");
            }
        }
         for(int i=0;i<n1;i++)
        {
            int c=0;
            if(a1[i]==-1)
            {
                continue;
            }
            for(int j=0;j<n;j++)
            {
                if(a1[i]==a[j])
                {
                    c+=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.print(a1[i]+" ");
            }
        }
    }
}