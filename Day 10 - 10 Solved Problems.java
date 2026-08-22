import java.util.*;
public class Day10Solved{
 static void matrix(int[][]a){for(int[]r:a){for(int x:r)System.out.print(x+" ");System.out.println();}}
 static int sum(int[][]a){int s=0;for(int[]r:a)for(int x:r)s+=x;return s;}
 static void rowSums(int[][]a){for(int[]r:a){int s=0;for(int x:r)s+=x;System.out.print(s+" ");}System.out.println();}
 static void colSums(int[][]a){for(int j=0;j<a[0].length;j++){int s=0;for(int[]r:a)s+=r[j];System.out.print(s+" ");}System.out.println();}
 static void diagonals(int[][]a){for(int i=0;i<a.length;i++)System.out.print(a[i][i]+" ");System.out.println();for(int i=0;i<a.length;i++)System.out.print(a[i][a.length-1-i]+" ");System.out.println();}
 static int max(int[][]a){int m=a[0][0];for(int[]r:a)for(int x:r)m=Math.max(m,x);return m;}
 static int[][] transpose(int[][]a){int[][]t=new int[a[0].length][a.length];for(int i=0;i<a.length;i++)for(int j=0;j<a[0].length;j++)t[j][i]=a[i][j];return t;}
 static int vowels(String s){int c=0;for(char x:s.toLowerCase().toCharArray())if("aeiou".indexOf(x)>=0)c++;return c;}
 static String reverse(String s){return new StringBuilder(s).reverse().toString();}
 static int freq(String s,char k){int c=0;for(char x:s.toCharArray())if(x==k)c++;return c;}
 public static void main(String[]x){int[][]a={{1,2,3},{4,5,6},{7,8,9}};matrix(a);System.out.println(sum(a));rowSums(a);colSums(a);diagonals(a);System.out.println(max(a));matrix(transpose(a));System.out.println(vowels("Java Programming"));System.out.println(reverse("hello"));System.out.println(freq("banana",'a'));}
}
