import java.util.Scanner;
class J{
    public static boolean Prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,c=0,k;
     
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
           k=sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(Prime(a[i]) && a[i]<=k){
                c++;
            }
        }
        System.out.println(c);
    }
}