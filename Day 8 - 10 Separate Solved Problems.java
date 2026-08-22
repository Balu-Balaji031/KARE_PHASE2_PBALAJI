// DAY 8 - ARRAYS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;int[]x=new int[n];for(int i=0;i<n;i++){x[i]=s.nextInt();sum+=x[i];}System.out.print(sum);}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=Integer.MIN_VALUE;for(int i=0;i<n;i++)m=Math.max(m,s.nextInt());System.out.print(m);}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),m=Integer.MAX_VALUE;for(int i=0;i<n;i++)m=Math.min(m,s.nextInt());System.out.print(m);}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]x=new int[n];for(int i=0;i<n;i++)x[i]=s.nextInt();for(int i=n-1;i>=0;i--)System.out.print(x[i]+" ");}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),e=0;for(int i=0;i<n;i++)if(s.nextInt()%2==0)e++;System.out.print(e);}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),o=0;for(int i=0;i<n;i++)if(s.nextInt()%2!=0)o++;System.out.print(o);}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),k=s.nextInt(),idx=-1;for(int i=0;i<n;i++)if(s.nextInt()==k&&idx<0)idx=i;System.out.print(idx);}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]x=new int[n];for(int i=0;i<n;i++)x[i]=s.nextInt();for(int l=0,r=n-1;l<r;l++,r--){int t=x[l];x[l]=x[r];x[r]=t;}System.out.println(Arrays.toString(x));}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),sum=0;for(int i=0;i<n;i++){int x=s.nextInt();if(x%2==0)sum+=x;}System.out.print(sum);}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int[]x=new int[n];for(int i=0;i<n;i++)x[i]=s.nextInt();for(int i=0;i<n;i++)for(int j=i+1;j<n;j++)if(x[i]>x[j]){int t=x[i];x[i]=x[j];x[j]=t;}System.out.println(Arrays.toString(x));}}
