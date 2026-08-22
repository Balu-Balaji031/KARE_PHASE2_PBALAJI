// DAY 3 - SWITCH AND LOOPS
import java.util.*;
class Problem1{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();switch(n){case 1:System.out.print("Monday");break;case 2:System.out.print("Tuesday");break;case 3:System.out.print("Wednesday");break;case 4:System.out.print("Thursday");break;case 5:System.out.print("Friday");break;case 6:System.out.print("Saturday");break;case 7:System.out.print("Sunday");break;default:System.out.print("Invalid");}}}
class Problem2{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++)System.out.print(i+" ");}}
class Problem3{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt(),x=0;for(int i=1;i<=n;i++)x+=i;System.out.print(x);}}
class Problem4{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++)if(i%2==0)System.out.print(i+" ");}}
class Problem5{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++)if(i%2!=0)System.out.print(i+" ");}}
class Problem6{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();long f=1;for(int i=2;i<=n;i++)f*=i;System.out.print(f);}}
class Problem7{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=10;i++)System.out.println(n+" x "+i+" = "+n*i);}}
class Problem8{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();for(int i=1;i<=n;i++)if(n%i==0)System.out.print(i+" ");}}
class Problem9{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();int sum=0;while(n>0){sum+=n%10;n/=10;}System.out.print(sum);}}
class Problem10{public static void main(String[]a){Scanner s=new Scanner(System.in);int n=s.nextInt();boolean p=n>1;for(int i=2;i*i<=n;i++)if(n%i==0)p=false;System.out.print(p?"Prime":"Not Prime");}}
