import java.util.*;
public class Day9Solved{
 static int single(int[]a){int x=0;for(int v:a)x^=v;return x;}
 static void zerosLeft(int[]a){int p=0;for(int x:a)if(x==0)p++;for(int i=0;i<a.length;i++)a[i]=i<p?0:1;}
 static void zerosRight(int[]a){int p=0;for(int x:a)if(x!=0)p++;for(int i=0;i<a.length;i++)a[i]=i<p?1:0;}
 static int missing(int[]a,int n){int x=0;for(int i=1;i<=n;i++)x^=i;for(int v:a)x^=v;return x;}
 static int second(int[]a){int m=Integer.MIN_VALUE,s=Integer.MIN_VALUE;for(int v:a){if(v>m){s=m;m=v;}else if(v> s&&v!=m)s=v;}return s;}
 static void duplicates(int[]a){for(int i=0;i<a.length;i++){for(int j=i+1;j<a.length;j++)if(a[i]==a[j]){System.out.print(a[i]+" ");break;}}System.out.println();}
 static void rotateRight(int[]a){if(a.length==0)return;int t=a[a.length-1];for(int i=a.length-1;i>0;i--)a[i]=a[i-1];a[0]=t;}
 static int majority(int[]a){for(int x:a){int c=0;for(int y:a)if(x==y)c++;if(c>a.length/2)return x;}return -1;}
 static int maxFreq(int[]a){int best=a[0],bc=0;for(int x:a){int c=0;for(int y:a)if(x==y)c++;if(c>bc){bc=c;best=x;}}return best;}
 static boolean pairSum(int[]a,int k){for(int i=0;i<a.length;i++)for(int j=i+1;j<a.length;j++)if(a[i]+a[j]==k)return true;return false;}
 public static void main(String[]x){int[]a={2,4,2,4,3};System.out.println(single(a));int[]b={0,1,0,1,0};zerosLeft(b);System.out.println(Arrays.toString(b));zerosRight(b);System.out.println(Arrays.toString(b));System.out.println(missing(new int[]{1,2,4,5},5));System.out.println(second(new int[]{5,1,9,3}));duplicates(new int[]{1,2,2,3,3});rotateRight(b);System.out.println(Arrays.toString(b));System.out.println(majority(new int[]{2,2,1,2}));System.out.println(maxFreq(new int[]{1,3,3,2,3}));System.out.println(pairSum(new int[]{2,7,11,15},9));}
}
