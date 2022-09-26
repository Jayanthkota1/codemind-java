import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x;
        x=sc.nextInt();
        if(x==2 || x==3)
        {
            System.out.println("Spring");
        }
        else if(x==4 || x==5 || x==6)
        {
            System.out.println("Summer");
        }
        else if(x==7 || x==8 || x==9 || x==10)
        {
            System.out.println("Rainy");
        }
        else if(x==1 || x==11 || x==12)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println("-1");
        }
    }
}