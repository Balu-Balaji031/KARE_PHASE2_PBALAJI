import java.util.*;
public class Day13Solved{
 static int maxFreq(int[]a){int m=a[0],c=0;for(int x:a){int f=0;for(int y:a)if(x==y)f++;if(f>c){c=f;m=x;}}return m;}
 static void left(int[]a){if(a.length==0)return;int t=a[0];for(int i=0;i<a.length-1;i++)a[i]=a[i+1];a[a.length-1]=t;}
 static void right(int[]a){if(a.length==0)return;int t=a[a.length-1];for(int i=a.length-1;i>0;i--)a[i]=a[i-1];a[0]=t;}
 static int second(int[]a){int m=Integer.MIN_VALUE,s=Integer.MIN_VALUE;for(int x:a){if(x>m){s=m;m=x;}else if(x>s&&x!=m)s=x;}return s;}
 static void evenOdd(int[]a){for(int x:a)if(x%2==0)System.out.print(x+" ");System.out.print("| ");for(int x:a)if(x%2!=0)System.out.print(x+" ");System.out.println();}
 static void unique(int[]a){for(int i=0;i<a.length;i++){int c=0;for(int x:a)if(x==a[i])c++;if(c==1)System.out.print(a[i]+" ");}System.out.println();}
 static void prefix(int[]a){int s=0;for(int x:a){s+=x;System.out.print(s+" ");}System.out.println();}
 static void rotate(int[]a,int k){k%=a.length;for(int q=0;q<k;q++)right(a);}
 static int majority(int[]a){for(int x:a){int c=0;for(int y:a)if(x==y)c++;if(c>a.length/2)return x;}return -1;}
 static void print(int[]a){System.out.println(Arrays.toString(a));}
 public static void main(String[]x){int[]a={1,2,2,3,3,3,4};System.out.println(maxFreq(a));left(a);print(a);right(a);print(a);System.out.println(second(a));evenOdd(a);unique(a);prefix(a);rotate(a,2);print(a);System.out.println(majority(new int[]{2,2,1,2}));}
}
