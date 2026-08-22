import java.util.*;
public class Day12Solved{
 static class Grand{void show(){System.out.println("Grandfather");}}
 static class Father extends Grand{void father(){System.out.println("Father");}}
 static class Son extends Father{void son(){System.out.println("Son");}}
 static class Animal{void sound(){System.out.println("Animal");}}
 static class Dog extends Animal{void bark(){System.out.println("Bark");}}
 static class Person{String name;Person(){name="Unknown";}Person(String n){name=n;}void show(){System.out.println(name);}}
 static class Box{int x;Box(){x=0;}Box(int n){x=n;}Box(Box b){x=b.x;} }
 static int gcd(int a,int b){while(b!=0){int t=a%b;a=b;b=t;}return a;}
 static boolean prime(int n){if(n<2)return false;for(int i=2;i*i<=n;i++)if(n%i==0)return false;return true;}
 static int sum(int[]a){int s=0;for(int x:a)s+=x;return s;}
 public static void main(String[]x){Son s=new Son();s.show();s.father();s.son();Dog d=new Dog();d.sound();d.bark();new Person().show();new Person("Balaji").show();Box b=new Box(10),c=new Box(b);System.out.println(c.x);System.out.println(gcd(24,36));System.out.println(prime(29));System.out.println(sum(new int[]{1,2,3,4,5}));}
}
