import java.util.*;
public class Day7Solved{
 static int fact(int n){int f=1;for(int i=1;i<=n;i++)f*=i;return f;}
 static boolean strong(int n){int t=n,s=0;while(n>0){s+=fact(n%10);n/=10;}return s==t;}
 static boolean armstrong(int n){int t=n,c=0,s=0;do{c++;n/=10;}while(n>0);n=t;while(n>0){s+=(int)Math.pow(n%10,c);n/=10;}return s==t;}
 static int divisorSum(int n){int s=0;for(int i=1;i<=n/2;i++)if(n%i==0)s+=i;return s;}
 static boolean perfect(int n){return divisorSum(n)==n;}
 static boolean abundant(int n){return divisorSum(n)>n;}
 static boolean deficient(int n){return divisorSum(n)<n;}
 static boolean amicable(int a,int b){return divisorSum(a)==b&&divisorSum(b)==a;}
 static void perfectRange(int n){for(int i=1;i<=n;i++)if(perfect(i))System.out.print(i+" ");System.out.println();}
 static void armRange(int n){for(int i=1;i<=n;i++)if(armstrong(i))System.out.print(i+" ");System.out.println();}
 static void strongRange(int n){for(int i=1;i<=n;i++)if(strong(i))System.out.print(i+" ");System.out.println();}
 public static void main(String[]x){System.out.println(strong(145));System.out.println(armstrong(153));System.out.println(divisorSum(12));System.out.println(perfect(28));System.out.println(abundant(12));System.out.println(deficient(10));System.out.println(amicable(220,284));perfectRange(1000);armRange(1000);strongRange(10000);}
}
