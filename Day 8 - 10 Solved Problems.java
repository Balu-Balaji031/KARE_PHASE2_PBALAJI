import java.util.*;
public class Day8Solved{
 static int[] read(Scanner s){int n=s.nextInt();int[]a=new int[n];for(int i=0;i<n;i++)a[i]=s.nextInt();return a;}
 static void print(int[]a){for(int x:a)System.out.print(x+" ");System.out.println();}
 static int sum(int[]a){int s=0;for(int x:a)s+=x;return s;}
 static int even(int[]a){int c=0;for(int x:a)if(x%2==0)c++;return c;}
 static int odd(int[]a){int c=0;for(int x:a)if(x%2!=0)c++;return c;}
 static int max(int[]a){int m=a[0];for(int x:a)m=Math.max(m,x);return m;}
 static int min(int[]a){int m=a[0];for(int x:a)m=Math.min(m,x);return m;}
 static void reverse(int[]a){for(int l=0,r=a.length-1;l<r;l++,r--){int t=a[l];a[l]=a[r];a[r]=t;}}
 static void shiftLeft(int[]a){if(a.length==0)return;int t=a[0];for(int i=0;i<a.length-1;i++)a[i]=a[i+1];a[a.length-1]=t;}
 static int search(int[]a,int k){for(int i=0;i<a.length;i++)if(a[i]==k)return i;return -1;}
 public static void main(String[]x){int[]a={1,2,3,4,5};print(a);System.out.println(sum(a));System.out.println(even(a));System.out.println(odd(a));System.out.println(max(a));System.out.println(min(a));reverse(a);print(a);shiftLeft(a);print(a);System.out.println(search(a,3));}
}
