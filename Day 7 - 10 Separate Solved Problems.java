// DAY 7 - NUMBER PROPERTIES
import java.util.*;
class Problem1{static int f(int n){int x=1;for(int i=2;i<=n;i++)x*=i;return x;}public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),t=n,sum=0;while(n>0){sum+=f(n%10);n/=10;}System.out.print(sum==t);}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),t=n,c=0,sum=0;do{c++;n/=10;}while(n>0);n=t;while(n>0){sum+=(int)Math.pow(n%10,c);n/=10;}System.out.print(sum==t);}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;for(int i=1;i<=n/2;i++)if(n%i==0)sum+=i;System.out.print(sum);}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;for(int i=1;i<=n/2;i++)if(n%i==0)sum+=i;System.out.print(sum==n);}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;for(int i=1;i<=n/2;i++)if(n%i==0)sum+=i;System.out.print(sum>n);}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;for(int i=1;i<=n/2;i++)if(n%i==0)sum+=i;System.out.print(sum<n);}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int x=s.nextInt(),y=s.nextInt(),a1=0,b=0;for(int i=1;i<=x/2;i++)if(x%i==0)a1+=i;for(int i=1;i<=y/2;i++)if(y%i==0)b+=i;System.out.print(a1==y&&b==x);}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int x=1;x<=n;x++){int sum=0;for(int i=1;i<=x/2;i++)if(x%i==0)sum+=i;if(sum==x)System.out.print(x+" ");}}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int x=1;x<=n;x++){int t=x,c=0,sum=0;do{c++;x/=10;}while(x>0);x=t;while(x>0){sum+=(int)Math.pow(x%10,c);x/=10;}if(sum==t)System.out.print(t+" ");}}}
class Problem10{static int f(int n){int r=1;for(int i=2;i<=n;i++)r*=i;return r;}public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int x=1;x<=n;x++){int t=x,z=x,sum=0;while(z>0){sum+=f(z%10);z/=10;}if(sum==t)System.out.print(t+" ");}}}
