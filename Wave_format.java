import java.util.*;
class JA
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
    Arrays.sort(a);
    int k=(n/2);
    int l=0;
    for(int i=0;i<k;i++)
    {
    System.out.print(a[n-l-2]+" ");
    System.out.print(a[n-l-1]+" ");
    l+=2;
    }
    if(n%2!=0)
    {
        System.out.print(a[0]);
    }
}
}