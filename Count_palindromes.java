import java.util.*;
class J{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            int k=a[i];
            int r=0,temp=a[i];
            while(k>0){
                int d=k%10;
                r=r*10+d;
                k=k/10;
            }
            if(r==temp){
                c++;
            }
        }
        System.out.println(c);
    }
}