import java.util.*;
public class Day11Solved{
 static int binary(int[]a,int k){int l=0,r=a.length-1;while(l<=r){int m=(l+r)/2;if(a[m]==k)return m;if(a[m]<k)l=m+1;else r=m-1;}return -1;}
 static void bubble(int[]a){for(int i=0;i<a.length-1;i++)for(int j=0;j<a.length-1-i;j++)if(a[j]>a[j+1]){int t=a[j];a[j]=a[j+1];a[j+1]=t;}}
 static void selection(int[]a){for(int i=0;i<a.length-1;i++){int p=i;for(int j=i+1;j<a.length;j++)if(a[j]<a[p])p=j;int t=a[i];a[i]=a[p];a[p]=t;}}
 static void insertion(int[]a){for(int i=1;i<a.length;i++){int k=a[i],j=i-1;while(j>=0&&a[j]>k){a[j+1]=a[j];j--;}a[j+1]=k;}}
 static int linear(int[]a,int k){for(int i=0;i<a.length;i++)if(a[i]==k)return i;return -1;}
 static int first(int[]a,int k){int l=0,r=a.length-1,ans=-1;while(l<=r){int m=(l+r)/2;if(a[m]>=k){if(a[m]==k)ans=m;r=m-1;}else l=m+1;}return ans;}
 static int last(int[]a,int k){int l=0,r=a.length-1,ans=-1;while(l<=r){int m=(l+r)/2;if(a[m]<=k){if(a[m]==k)ans=m;l=m+1;}else r=m-1;}return ans;}
 static int count(int[]a,int k){int f=first(a,k),l=last(a,k);return f==-1?0:l-f+1;}
 static void print(int[]a){System.out.println(Arrays.toString(a));}
 static boolean sorted(int[]a){for(int i=1;i<a.length;i++)if(a[i]<a[i-1])return false;return true;}
 public static void main(String[]x){int[]a={1,2,4,4,4,8};System.out.println(binary(a,4));System.out.println(linear(a,8));System.out.println(first(a,4));System.out.println(last(a,4));System.out.println(count(a,4));int[]b={5,1,4,2,8};bubble(b);print(b);int[]c={5,1,4,2,8};selection(c);print(c);int[]d={5,1,4,2,8};insertion(d);print(d);System.out.println(sorted(d));}
}
