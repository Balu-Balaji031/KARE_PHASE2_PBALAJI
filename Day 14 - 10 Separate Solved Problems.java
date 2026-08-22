// DAY 14 - RECURSION
class Problem1{static int f(int n){return n<=1?1:n*f(n-1);}public static void main(String[]x){System.out.print(f(5));}}
class Problem2{static int f(int n){return n<=1?n:f(n-1)+f(n-2);}public static void main(String[]x){System.out.print(f(10));}}
class Problem3{static int f(int n){return n<=0?0:n+f(n-1);}public static void main(String[]x){System.out.print(f(10));}}
class Problem4{static int p(int a,int n){return n==0?1:a*p(a,n-1);}public static void main(String[]x){System.out.print(p(2,8));}}
class Problem5{static int gcd(int a,int b){return b==0?a:gcd(b,a%b);}public static void main(String[]x){System.out.print(gcd(24,36));}}
class Problem6{static int digits(int n){return n<10?1:1+digits(n/10);}public static void main(String[]x){System.out.print(digits(12345));}}
class Problem7{static int sum(int n){return n==0?0:n%10+sum(n/10);}public static void main(String[]x){System.out.print(sum(12345));}}
class Problem8{static void print(int n){if(n==0)return;print(n-1);System.out.print(n+" ");}public static void main(String[]x){print(5);}}
class Problem9{static boolean pal(String s,int l,int r){return l>=r||(s.charAt(l)==s.charAt(r)&&pal(s,l+1,r-1));}public static void main(String[]x){System.out.print(pal("level",0,4));}}
class Problem10{static int reverse(int n,int r){return n==0?r:reverse(n/10,r*10+n%10);}public static void main(String[]x){System.out.print(reverse(12345,0));}}
