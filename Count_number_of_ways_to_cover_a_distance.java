import java.util.*;
class GFG
{
static int countWays(int n)
{
    if (n == 0)
        return 1;
    if (n <= 2)
        return n;
    int f0 = 1, f1 = 1, f2 = 2;
    int ans=0;
    for (int i = 3; i <= n; i++)
    {
        ans = f0 + f1 + f2;
        f0 = f1;
        f1 = f2;
        f2 = ans;
    }
    return ans;
}
public static void main (String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println (countWays(n));
}
}
 