import java.util.*;
public class Day5Solved{
 static boolean pal(int n){int t=n,r=0;while(n>0){r=r*10+n%10;n/=10;}return t==r;}
 static void pals(int n){for(int i=1;i<=n;i++)if(pal(i))System.out.print(i+" ");System.out.println();}
 static void rev(int n){int r=0;while(n>0){r=r*10+n%10;n/=10;}System.out.println(r);}
 static void sumDigits(int n){int s=0;while(n>0){s+=n%10;n/=10;}System.out.println(s);}
 static void productDigits(int n){int p=1;while(n>0){p*=n%10;n/=10;}System.out.println(p);}
 static void digitCount(int n){int c=0;do{c++;n/=10;}while(n!=0);System.out.println(c);}
 static void evenOddDigits(int n){int e=0,o=0;while(n>0){if((n%10)%2==0)e++;else o++;n/=10;}System.out.println(e+" "+o);}
 static void primeDigits(int n){int c=0;while(n>0){int d=n%10;if(d==2||d==3||d==5||d==7)c++;n/=10;}System.out.println(c);}
 static void firstLast(int n){int last=n%10;while(n>=10)n/=10;System.out.println(n+" "+last);}
 static void digitMax(int n){int m=0;while(n>0){m=Math.max(m,n%10);n/=10;}System.out.println(m);}
 public static void main(String[]x){System.out.println(pal(121));pals(200);rev(12345);sumDigits(12345);productDigits(1234);digitCount(98765);evenOddDigits(123456);primeDigits(235789);firstLast(9876);digitMax(58321);}
}
