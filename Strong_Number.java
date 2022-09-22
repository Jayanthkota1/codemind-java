import java.util.*;
class J{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n,i,r,temp,prod=1,sum=0;
    n=s.nextInt();
    temp=n;
    while(n>0)
    {
        prod=1;
        r=n%10;
        for(i=1;i<=r;i++)
        {
            prod=prod*i;
        }
        sum=sum+prod;
        n=n/10;
        
    }
    if(temp==sum)
    {
        System.out.println("The number "+temp+" is a strong number");
    }
    else
    {
       System.out.println("The number "+temp+" is not a strong number");
    }
}
}