import java.util.Scanner;
class divisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,a,min=9999;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(a<min)
            {
                min=a;
            }
        }
        System.out.print(min);
        sc.close();
    }
}