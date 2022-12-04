import java.util.Scanner;
class Array
{
       public static void main(String args[])
      {
           Scanner sc=new Scanner (System.in);
           int n,i,c=0,s=0,z=0,j,k,max=0,min=999,g=0,g1=0;
           float avg=0;
           n=sc.nextInt();
          int x[]=new int[n];
          for(i=0;i<n;i++)
          {
               x[i]=sc.nextInt();
             
          }
          for(i=0;i<n;i++)
          {
               if(x[i]>max)
               {
                   max=x[i];
                   g=i;
               }
               if(x[i]<min)
               {
                   min=x[i];
                   g1=i;
               }
          }
          if(g1>g)
          {
              int temp=g1;
              g1=g;
              g=temp;
          }
          for(i=g1;i<=g;i++)
          {
              c=0;
              if(x[i]<=1)
              {
                  continue;
              }
              for(j=1;j<=x[i];j++)
              {
                  if(x[i]%j==0)
                  {
                      c+=1;
                  }
              }
              if(c==2)
              {
                     z+=1;
              }
          }
          System.out.print(z);
           sc.close();
      }
}