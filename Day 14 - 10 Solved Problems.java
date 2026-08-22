import java.util.*;
public class Day14Solved{
 static int fib(int n){return n<=1?n:fib(n-1)+fib(n-2);}
 static int fact(int n){return n<=1?1:n*fact(n-1);}
 static int sumN(int n){return n<=0?0:n+sumN(n-1);}
 static int power(int a,int n){return n==0?1:a*power(a,n-1);}
 static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}
 static int digits(int n){return n<10?1:1+digits(n/10);}
 static int digitSum(int n){return n==0?0:n%10+digitSum(n/10);}
 static void print1toN(int n){if(n==0)return;print1toN(n-1);System.out.print(n+" ");}
 static boolean palindrome(String s,int l,int r){return l>=r||(s.charAt(l)==s.charAt(r)&&palindrome(s,l+1,r-1));}
 static class Student{int roll;String name;Student(){roll=0;name="Unknown";}Student(int r,String n){roll=r;name=n;}Student(Student s){roll=s.roll;name=s.name;}void show(){System.out.println(roll+" "+name);}}
 public static void main(String[]x){System.out.println(fib(10));System.out.println(fact(5));System.out.println(sumN(10));System.out.println(power(2,8));System.out.println(gcd(24,36));System.out.println(digits(12345));System.out.println(digitSum(12345));print1toN(5);System.out.println();System.out.println(palindrome("level",0,4));Student a=new Student(10,"Balaji"),b=new Student(a);b.show();}
}
