// DAY 10 - MATRICES AND STRINGS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt();for(int i=0;i<r;i++){for(int j=0;j<c;j++)System.out.print(s.nextInt()+" ");System.out.println();}}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt(),sum=0;for(int i=0;i<r;i++)for(int j=0;j<c;j++)sum+=s.nextInt();System.out.print(sum);}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int[][]x=new int[n][n];for(int i=0;i<n;i++)for(int j=0;j<n;j++)x[i][j]=s.nextInt();for(int i=0;i<n;i++)System.out.print(x[i][i]+" ");}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt();int[][]x=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)x[i][j]=s.nextInt();for(int j=0;j<c;j++){for(int i=0;i<r;i++)System.out.print(x[i][j]+" ");System.out.println();}}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt();int[][]x=new int[r][c];for(int i=0;i<r;i++)for(int j=0;j<c;j++)x[i][j]=s.nextInt();for(int i=0;i<r;i++){int z=0;for(int j=0;j<c;j++)z+=x[i][j];System.out.print(z+" ");}}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int r=s.nextInt(),c=s.nextInt(),m=Integer.MIN_VALUE;for(int i=0;i<r;i++)for(int j=0;j<c;j++)m=Math.max(m,s.nextInt());System.out.print(m);}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);String x=s.nextLine();int v=0;for(char c:x.toLowerCase().toCharArray())if("aeiou".indexOf(c)>=0)v++;System.out.print(v);}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);String x=s.nextLine();for(int i=x.length()-1;i>=0;i--)System.out.print(x.charAt(i));}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);String x=s.nextLine();int[]f=new int[256];for(char c:x.toCharArray())f[c]++;for(int i=0;i<256;i++)if(f[i]>0)System.out.println((char)i+" "+f[i]);}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);String x=s.nextLine(),r="";for(int i=x.length()-1;i>=0;i--)r+=x.charAt(i);System.out.print(x.equals(r)?"Palindrome":"Not Palindrome");}}
