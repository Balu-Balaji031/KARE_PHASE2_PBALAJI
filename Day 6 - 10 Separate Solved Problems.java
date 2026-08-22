// DAY 6 - DIGIT OPERATIONS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),c=0;do{c++;n/=10;}while(n!=0);System.out.print(c);}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;while(n>0){sum+=n%10;n/=10;}System.out.print(sum);}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),r=0;while(n>0){r=r*10+n%10;n/=10;}System.out.print(r);}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),t=n,r=0;while(n>0){r=r*10+n%10;n/=10;}System.out.print(t==r);}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),c=0;while(n>0){if((n%10)%2==0)c++;n/=10;}System.out.print(c);}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),c=0;while(n>0){if((n%10)%2!=0)c++;n/=10;}System.out.print(c);}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),c=0;while(n>0){int d=n%10;if(d==2||d==3||d==5||d==7)c++;n/=10;}System.out.print(c);}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=0;while(n>0){m=Math.max(m,n%10);n/=10;}System.out.print(m);}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=9;while(n>0){m=Math.min(m,n%10);n/=10;}System.out.print(m);}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();while(n>=10){int x=n,sum=0;while(x>0){sum+=x%10;x/=10;}n=sum;}System.out.print(n);}}
