import java.util.*;

// Day 1 - Pattern Practice: 10 solved problems
public class Day1Solved {
    static void hollowRectangle(int r,int c){for(int i=0;i<r;i++){for(int j=0;j<c;j++)System.out.print(i==0||i==r-1||j==0||j==c-1?'*':' ');System.out.println();}}
    static void rightTriangle(int n){for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print('*');System.out.println();}}
    static void invertedTriangle(int n){for(int i=n;i>=1;i--){for(int j=1;j<=i;j++)System.out.print('*');System.out.println();}}
    static void pyramid(int n){for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print(' ');for(int j=1;j<=2*i-1;j++)System.out.print('*');System.out.println();}}
    static void invertedPyramid(int n){for(int i=n;i>=1;i--){for(int s=1;s<=n-i;s++)System.out.print(' ');for(int j=1;j<=2*i-1;j++)System.out.print('*');System.out.println();}}
    static void diamond(int n){pyramid(n);invertedPyramid(n-1);}
    static void hollowPyramid(int n){for(int i=1;i<=n;i++){for(int s=1;s<=n-i;s++)System.out.print(' ');for(int j=1;j<=2*i-1;j++)System.out.print(i==n||j==1||j==2*i-1?'*':' ');System.out.println();}}
    static void numberTriangle(int n){for(int i=1;i<=n;i++){for(int j=1;j<=i;j++)System.out.print(j);System.out.println();}}
    static void checker(int n){for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print((i+j)%2);System.out.println();}}
    static void hollowDiagonalSquare(int n){for(int i=0;i<n;i++){for(int j=0;j<n;j++)System.out.print(i==0||j==0||i==n-1||j==n-1||i==j||i+j==n-1?'*':' ');System.out.println();}}
    public static void main(String[] args){hollowRectangle(4,7);rightTriangle(5);invertedTriangle(5);pyramid(4);invertedPyramid(4);diamond(4);hollowPyramid(5);numberTriangle(5);checker(5);hollowDiagonalSquare(5);}
}
