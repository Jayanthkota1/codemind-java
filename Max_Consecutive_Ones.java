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
        int c=0,max=0;
        for(int i=0;i<n;i++)
        {
             if(a[i]==0)
             {
                 if(max<c)
                 {
                     max=c;
                 }
                 c=0;
             }
             else
             {
             c+=1;
             }
        }
        if(max<c)
        {
            max=c;
        }
        System.out.println(max);
    }
}