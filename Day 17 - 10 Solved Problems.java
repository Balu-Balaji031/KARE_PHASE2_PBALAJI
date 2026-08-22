public class Day17Solved{
 static class Node{int data;Node next;Node(int d){data=d;}}
 static Node add(Node h,int x){Node n=new Node(x);if(h==null)return n;Node p=h;while(p.next!=null)p=p.next;p.next=n;return h;}
 static Node delete(Node h,int k){if(h==null)return null;if(h.data==k)return h.next;Node p=h;while(p.next!=null&&p.next.data!=k)p=p.next;if(p.next!=null)p.next=p.next.next;return h;}
 static Node reverse(Node h){Node p=null;while(h!=null){Node n=h.next;h.next=p;p=h;h=n;}return p;}
 static boolean palindrome(Node h){java.util.ArrayList<Integer>a=new java.util.ArrayList<>();while(h!=null){a.add(h.data);h=h.next;}for(int i=0,j=a.size()-1;i<j;i++,j--)if(!a.get(i).equals(a.get(j)))return false;return true;}
 static int middle(Node h){Node s=h,f=h;while(f!=null&&f.next!=null){s=s.next;f=f.next.next;}return s.data;}
 static int nthFromEnd(Node h,int n){Node a=h,b=h;for(int i=0;i<n;i++)b=b.next;while(b!=null){a=a.next;b=b.next;}return a.data;}
 static int length(Node h){int c=0;while(h!=null){c++;h=h.next;}return c;}
 static boolean search(Node h,int k){while(h!=null){if(h.data==k)return true;h=h.next;}return false;}
 static void print(Node h){while(h!=null){System.out.print(h.data+" ");h=h.next;}System.out.println();}
 public static void main(String[]x){Node h=null;for(int i=1;i<=5;i++)h=add(h,i);print(h);System.out.println(search(h,3));System.out.println(length(h));System.out.println(middle(h));System.out.println(nthFromEnd(h,2));h=delete(h,3);print(h);h=reverse(h);print(h);System.out.println(palindrome(h));}
}
