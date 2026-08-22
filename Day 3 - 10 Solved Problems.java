import java.util.*;
public class Day3Solved{
 static void week(int n){String[]a={"","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};System.out.println(n>=1&&n<=7?a[n]:"Invalid");}
 static void month(int n){String[]a={"","Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};System.out.println(n>=1&&n<=12?a[n]:"Invalid");}
 static void sumN(int n){int s=0;for(int i=1;i<=n;i++)s+=i;System.out.println(s);}
 static void range(int a,int b){for(int i=a;i<=b;i++)System.out.print(i+" ");System.out.println();}
 static void evens(int a,int b){for(int i=a;i<=b;i++)if(i%2==0)System.out.print(i+" ");System.out.println();}
 static void odds(int a,int b){for(int i=a;i<=b;i++)if(i%2!=0)System.out.print(i+" ");System.out.println();}
 static long fact(int n){long f=1;for(int i=2;i<=n;i++)f*=i;return f;}
 static void table(int n){for(int i=1;i<=10;i++)System.out.println(n+" x "+i+" = "+n*i);}
 static void factors(int n){for(int i=1;i<=n;i++)if(n%i==0)System.out.print(i+" ");System.out.println();}
 static void prime(int n){if(n<2){System.out.println("Not Prime");return;}for(int i=2;i*i<=n;i++)if(n%i==0){System.out.println("Not Prime");return;}System.out.println("Prime");}
 public static void main(String[]x){week(3);month(8);sumN(10);range(5,10);evens(1,10);odds(1,10);System.out.println(fact(5));table(7);factors(24);prime(29);}
}
