import java.util.*;
public class Day4Solved{
 static void a(int n){for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print(' ');for(int j=1;j<=i;j++)System.out.print('*');System.out.println();}}
 static void b(int n){for(int i=n;i>=1;i--){for(int s=0;s<n-i;s++)System.out.print(' ');for(int j=0;j<i;j++)System.out.print('*');System.out.println();}}
 static void c(int n){for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print(' ');for(int j=1;j<=2*i-1;j++)System.out.print('*');System.out.println();}}
 static void d(int n){for(int i=n;i>=1;i--){for(int s=0;s<n-i;s++)System.out.print(' ');for(int j=1;j<=2*i-1;j++)System.out.print('*');System.out.println();}}
 static void e(int n){for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j);System.out.println();}}
 static void f(int n){for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(i);System.out.println();}}
 static void g(int n){for(int i=1;i<=n;i++){for(int j=n;j>=i;j--)System.out.print(j);System.out.println();}}
 static void h(int n){for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i+j)%2==0?'1':'0');System.out.println();}}
 static void i(int n){for(int r=0;r<n;r++){for(int c=0;c<n;c++)System.out.print(r==c||r+c==n-1?'*':' ');System.out.println();}}
 static void j(int n){int x=1;for(int r=1;r<=n;r++){for(int c=1;c<=r;c++)System.out.print(x++ +" ");System.out.println();}}
 public static void main(String[]x){a(5);b(5);c(5);d(5);e(5);f(5);g(5);h(5);i(5);j(5);}
}
