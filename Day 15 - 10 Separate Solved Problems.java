// DAY 15 - LINKED LIST
class Problem1{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);for(N p=h;p!=null;p=p.n)System.out.print(p.d+" ");}}
class Problem2{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(2);N n=new N(3);n.n=h;h=new N(1);h.n=n;for(N p=h;p!=null;p=p.n)System.out.print(p.d+" ");}}
class Problem3{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);h.n=h.n;for(N p=h;p!=null;p=p.n)System.out.print(p.d+" ");}}
class Problem4{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);int c=0;for(N p=h;p!=null;p=p.n)c++;System.out.print(c);}}
class Problem5{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);int sum=0;for(N p=h;p!=null;p=p.n)sum+=p.d;System.out.print(sum);}}
class Problem6{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);int k=2;for(N p=h;p!=null;p=p.n)if(p.d==k){System.out.print(true);return;}System.out.print(false);}}
class Problem7{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);N p=null;while(h!=null){N q=h.n;h.n=p;p=h;h=q;}for(N z=p;z!=null;z=z.n)System.out.print(z.d+" ");}}
class Problem8{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(5);h.n.n=new N(3);int m=Integer.MIN_VALUE;for(N p=h;p!=null;p=p.n)m=Math.max(m,p.d);System.out.print(m);}}
class Problem9{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(5);h.n.n=new N(3);int m=Integer.MAX_VALUE;for(N p=h;p!=null;p=p.n)m=Math.min(m,p.d);System.out.print(m);}}
class Problem10{static class N{int d;N n;N(int d){this.d=d;}}public static void main(String[]x){N h=new N(1);h.n=new N(2);h.n.n=new N(3);N s=h,f=h;while(f!=null&&f.n!=null){s=s.n;f=f.n.n;}System.out.print(s.d);}}
