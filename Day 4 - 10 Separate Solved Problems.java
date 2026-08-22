// DAY 4 - PATTERNS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print("* ");System.out.println();}}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=n;i>0;i--){for(int j=0;j<i;j++)System.out.print("* ");System.out.println();}}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){for(int k=0;k<n-i;k++)System.out.print(" ");for(int j=0;j<2*i-1;j++)System.out.print("*");System.out.println();}}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=n;i>0;i--){for(int k=0;k<n-i;k++)System.out.print(" ");for(int j=0;j<2*i-1;j++)System.out.print("*");System.out.println();}}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j);System.out.println();}}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(i);System.out.println();}}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=n;i>0;i--){for(int j=n;j>=n-i+1;j--)System.out.print(j);System.out.println();}}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i+j)%2);System.out.println();}}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print(i==j||i+j==n-1?'*':' ');System.out.println();}}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print(i==0||j==0||i==n-1||j==n-1?'*':' ');System.out.println();}}}
