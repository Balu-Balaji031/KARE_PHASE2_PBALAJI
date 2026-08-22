// DAY 2 - CONDITIONAL STATEMENTS
// 10 separate Java programs
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();System.out.print(n>0?"Positive":n<0?"Negative":"Zero");}}
import java.util.*;
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt();System.out.print(x>y?x:y);}}
import java.util.*;
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();System.out.print(Math.max(x,Math.max(y,z)));}}
import java.util.*;
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);char c=s.next().charAt(0);c=Character.toLowerCase(c);System.out.print("aeiou".indexOf(c)>=0?"Vowel":"Consonant");}}
import java.util.*;
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);char c=s.next().charAt(0);System.out.print(Character.isUpperCase(c)?"Uppercase":Character.isLowerCase(c)?"Lowercase":Character.isDigit(c)?"Digit":"Special");}}
import java.util.*;
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int age=s.nextInt();System.out.print(age>=18?"Eligible":"Not Eligible");}}
import java.util.*;
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int m=s.nextInt();System.out.print(m>=90?'A':m>=80?'B':m>=70?'C':m>=60?'D':'F');}}
import java.util.*;
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),z=s.nextInt();System.out.print(x+y>z&&x+z>y&&y+z>x?"Valid":"Invalid");}}
import java.util.*;
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();System.out.print(n%3==0&&n%5==0?"Divisible":"Not Divisible");}}
import java.util.*;
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int y=s.nextInt();System.out.print(y%400==0||y%4==0&&y%100!=0?"Leap Year":"Not Leap Year");}}
