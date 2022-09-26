import java.util.Scanner;
class king
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=(n*(n-1))/2;
        System.out.println(k);
    }
}