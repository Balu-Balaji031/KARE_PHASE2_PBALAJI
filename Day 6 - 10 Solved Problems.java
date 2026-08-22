import java.util.*;
public class Day6Solved{
 static int count(int n){int c=0;do{c++;n/=10;}while(n!=0);return c;}
 static int sum(int n){int s=0;while(n!=0){s+=n%10;n/=10;}return s;}
 static int rev(int n){int r=0;while(n!=0){r=r*10+n%10;n/=10;}return r;}
 static boolean pal(int n){return n==rev(n);}
 static int even(int n){int c=0;while(n!=0){if((n%10)%2==0)c++;n/=10;}return c;}
 static int odd(int n){int c=0;while(n!=0){if((n%10)%2!=0)c++;n/=10;}return c;}
 static int primeDigit(int n){int c=0;while(n!=0){int d=n%10;if(d==2||d==3||d==5||d==7)c++;n/=10;}return c;}
 static int maxDigit(int n){int m=0;while(n!=0){m=Math.max(m,n%10);n/=10;}return m;}
 static int minDigit(int n){int m=9;while(n!=0){m=Math.min(m,n%10);n/=10;}return m;}
 static int digitalSum(int n){while(n>=10)n=sum(n);return n;}
 public static void main(String[]x){System.out.println(count(678775));System.out.println(sum(12345));System.out.println(rev(4567));System.out.println(pal(151));System.out.println(even(234567));System.out.println(odd(234567));System.out.println(primeDigit(3456789));System.out.println(maxDigit(58321));System.out.println(minDigit(58321));System.out.println(digitalSum(9875));}
}
