import java.util.Scanner;
class Triangle
{
public static void main(String x[])
{

Scanner sc=new Scanner(System.in);
int a,b,c;
float S,Area;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
S=(float)(a+b+c)/2;
Area=(float)Math.sqrt(S*(S-a)*(S-b)*(S-c));
System.out.format("%.2f",Area);
}

}