// DAY 1 - PATTERNS
// Each problem below is a separate, independently compilable Java program.

// Problem 1: Solid square
import java.util.*;
class Problem1 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print("* ");System.out.println();} } }

// Problem 2: Increasing triangle
import java.util.*;
class Problem2 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print("* ");System.out.println();} } }

// Problem 3: Decreasing triangle
import java.util.*;
class Problem3 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=n;i>=1;i--){for(int j=1;j<=i;j++)System.out.print("* ");System.out.println();} } }

// Problem 4: Right aligned triangle
import java.util.*;
class Problem4 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print("  ");for(int j=1;j<=i;j++)System.out.print("* ");System.out.println();} } }

// Problem 5: Number triangle
import java.util.*;
class Problem5 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j+" ");System.out.println();} } }

// Problem 6: Same number in each row
import java.util.*;
class Problem6 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(i+" ");System.out.println();} } }

// Problem 7: Inverted number triangle
import java.util.*;
class Problem7 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=n;i>=1;i--){for(int j=1;j<=i;j++)System.out.print(j+" ");System.out.println();} } }

// Problem 8: 0-1 checkerboard
import java.util.*;
class Problem8 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i+j)%2==0?"0 ":"1 ");System.out.println();} } }

// Problem 9: X pattern
import java.util.*;
class Problem9 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print(i==j||i+j==n-1?"* ":"  ");System.out.println();} } }

// Problem 10: Hollow square
import java.util.*;
class Problem10 { public static void main(String[] args){ Scanner sc=new Scanner(System.in); int n=sc.nextInt(); for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print(i==0||j==0||i==n-1||j==n-1?"* ":"  ");System.out.println();} } }
