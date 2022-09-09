import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float k;
        k=(float)(a+b)/2;
        System.out.format("%.4f",k);
    }
}