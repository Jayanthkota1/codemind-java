import java.util.*;
class j{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n,c=0;
    n=s.nextInt();
    while(n>5)
    {
        if(n%2==0)
        {
            n=n/2;
        }
        else if(n%3==0)
        {
            n=n/3;
        }
        else if(n%5==0)
        {
            n=n/5;
        }
        else
        {
            c=1;
            break;
        }
    }
    if(c==1 || n<=0)
    {
        System.out.println("Not Ugly Number");
    }
    else
    {
        System.out.println("Ugly Number");
    }
}
    }