import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,c;
        Double k,A;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        k=(double)(a+b+c)/2;
        A=Math.sqrt(k*(k-a)*(k-b)*(k-c));
        System.out.format("%.2f",A);
    }
}