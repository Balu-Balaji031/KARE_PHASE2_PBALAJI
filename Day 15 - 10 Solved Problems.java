public class Day15Solved{
 static class Node{int data;Node next;Node(int d){data=d;}}
 static Node addEnd(Node h,int x){Node n=new Node(x);if(h==null)return n;Node p=h;while(p.next!=null)p=p.next;p.next=n;return h;}
 static Node addFront(Node h,int x){Node n=new Node(x);n.next=h;return n;}
 static Node delete(Node h,int k){if(h==null)return null;if(h.data==k)return h.next;Node p=h;while(p.next!=null&&p.next.data!=k)p=p.next;if(p.next!=null)p.next=p.next.next;return h;}
 static boolean search(Node h,int k){while(h!=null){if(h.data==k)return true;h=h.next;}return false;}
 static int length(Node h){int c=0;while(h!=null){c++;h=h.next;}return c;}
 static int sum(Node h){int s=0;while(h!=null){s+=h.data;h=h.next;}return s;}
 static Node reverse(Node h){Node p=null;while(h!=null){Node n=h.next;h.next=p;p=h;h=n;}return p;}
 static int max(Node h){int m=Integer.MIN_VALUE;while(h!=null){m=Math.max(m,h.data);h=h.next;}return m;}
 static int min(Node h){int m=Integer.MAX_VALUE;while(h!=null){m=Math.min(m,h.data);h=h.next;}return m;}
 static void print(Node h){while(h!=null){System.out.print(h.data+" ");h=h.next;}System.out.println();}
 public static void main(String[]x){Node h=null;h=addEnd(h,1);h=addEnd(h,2);h=addEnd(h,3);h=addFront(h,0);print(h);h=delete(h,2);print(h);System.out.println(search(h,3));System.out.println(length(h));System.out.println(sum(h));h=reverse(h);print(h);System.out.println(max(h));System.out.println(min(h));}
}
