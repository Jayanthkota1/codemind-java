import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char x;
        x=sc.nextLine().charAt(0);
        if(x=='V' ||x=='v')
        {
            System.out.println("Violet");
        }
        else if(x=='I' || x=='i')
        {
            System.out.println("Indigo");
        }
        else if(x=='B' || x=='b')
        {
            System.out.println("Blue");
        }
        else if(x=='G' || x=='g')
        {
            System.out.println("Green");
        }
        else if(x=='Y' || x=='y')
        {
            System.out.println("Yellow");
        }
        else if(x=='O' || x=='o')
        {
            System.out.println("Orange");
        }
        else if(x=='R' || x=='r')
        {
            System.out.println("Red");
        }
        else
        {
            System.out.println("-1");
        }
    }
}