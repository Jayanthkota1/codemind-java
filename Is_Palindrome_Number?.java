import java.util.*;
class J{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,d,r=0,t;
        a=s.nextInt();
        if(a<0){
            a=a*(-1);
        }
        t=a;
        while(t>0){
            d=t%10;
            r=r*10+d;
            t=t/10;
        }
        if(a==r && a>0){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }
}