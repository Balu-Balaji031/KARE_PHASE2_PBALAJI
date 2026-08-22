// DAY 2 - CONDITIONAL STATEMENTS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();System.out.print(n>0?"Positive":n<0?"Negative":"Zero");}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt();System.out.print(Math.max(x,y));}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();System.out.print(Math.max(x,Math.max(y,z)));}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);char c=Character.toLowerCase(s.next().charAt(0));System.out.print("aeiou".indexOf(c)>=0?"Vowel":"Consonant");}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);char c=s.next().charAt(0);System.out.print(Character.isUpperCase(c)?"Uppercase":Character.isLowerCase(c)?"Lowercase":Character.isDigit(c)?"Digit":"Special");}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int age=s.nextInt();System.out.print(age>=18?"Eligible":"Not Eligible");}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int m=s.nextInt();System.out.print(m>=90?'A':m>=80?'B':m>=70?'C':m>=60?'D':'F');}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();System.out.print(x+y>z&&x+z>y&&y+z>x?"Valid":"Invalid");}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();System.out.print(n%3==0&&n%5==0?"Divisible":"Not Divisible");}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int y=s.nextInt();System.out.print(y%400==0||y%4==0&&y%100!=0?"Leap Year":"Not Leap Year");}}
