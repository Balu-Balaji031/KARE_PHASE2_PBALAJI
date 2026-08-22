import java.util.*;
public class Day2Solved{
 static void sign(int n){System.out.println(n>0?"Positive":n<0?"Negative":"Zero");}
 static void max2(int a,int b){System.out.println(Math.max(a,b));}
 static void max3(int a,int b,int c){System.out.println(Math.max(a,Math.max(b,c)));}
 static void vowel(char c){c=Character.toLowerCase(c);System.out.println("aeiou".indexOf(c)>=0?"Vowel":"Consonant");}
 static void type(char c){System.out.println(Character.isUpperCase(c)?"Uppercase":Character.isLowerCase(c)?"Lowercase":Character.isDigit(c)?"Digit":"Special");}
 static void age(int a){System.out.println(a>=18?"Eligible":"Not Eligible");}
 static void grade(int m){System.out.println(m>=90?'A':m>=80?'B':m>=70?'C':m>=60?'D':'F');}
 static void triangle(int a,int b,int c){System.out.println(a+b>c&&a+c>b&&b+c>a?"Valid":"Invalid");}
 static void div35(int n){System.out.println(n%3==0&&n%5==0?"Divisible":"Not Divisible");}
 static void leap(int y){System.out.println(y%400==0||y%4==0&&y%100!=0?"Leap":"Not Leap");}
 public static void main(String[]x){sign(-5);max2(4,9);max3(3,8,5);vowel('E');type('7');age(20);grade(85);triangle(3,4,5);div35(30);leap(2028);}
}
