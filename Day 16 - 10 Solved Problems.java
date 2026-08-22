import java.util.*;
public class Day16Solved{
 static void matrix(int V,int[][]e){int[][]a=new int[V][V];for(int[]x:e){a[x[0]][x[1]]=a[x[1]][x[0]]=1;}for(int[]r:a){for(int v:r)System.out.print(v+" ");System.out.println();}}
 static List<Integer>[] adj(int V,int[][]e){List<Integer>[]g=new ArrayList[V];for(int i=0;i<V;i++)g[i]=new ArrayList<>();for(int[]x:e){g[x[0]].add(x[1]);g[x[1]].add(x[0]);}return g;}
 static void bfs(List<Integer>[]g,int s){boolean[]v=new boolean[g.length];Queue<Integer>q=new LinkedList<>();q.add(s);v[s]=true;while(!q.isEmpty()){int u=q.poll();System.out.print(u+" ");for(int x:g[u])if(!v[x]){v[x]=true;q.add(x);}}System.out.println();}
 static void dfs(List<Integer>[]g,int u,boolean[]v){v[u]=true;System.out.print(u+" ");for(int x:g[u])if(!v[x])dfs(g,x,v);}
 static int degree(List<Integer>[]g,int u){return g[u].size();}
 static int edges(int[][]e){return e.length;}
 static boolean connected(List<Integer>[]g){boolean[]v=new boolean[g.length];dfs(g,0,v);for(boolean x:v)if(!x)return false;return true;}
 static void path(List<Integer>[]g,int s,int t){Queue<Integer>q=new LinkedList<>();int[]p=new int[g.length];Arrays.fill(p,-1);q.add(s);p[s]=s;while(!q.isEmpty()){int u=q.poll();for(int x:g[u])if(p[x]==-1){p[x]=u;q.add(x);}}if(p[t]==-1){System.out.println("No path");return;}List<Integer>r=new ArrayList<>();for(int x=t;x!=s;x=p[x])r.add(x);r.add(s);Collections.reverse(r);System.out.println(r);}
 static boolean selfLoop(int[][]e){for(int[]x:e)if(x[0]==x[1])return true;return false;}
 static void printAdj(List<Integer>[]g){for(int i=0;i<g.length;i++)System.out.println(i+": "+g[i]);}
 public static void main(String[]x){int[][]e={{0,1},{0,2},{1,3},{1,4}};matrix(5,e);List<Integer>[]g=adj(5,e);printAdj(g);bfs(g,0);dfs(g,0,new boolean[5]);System.out.println();System.out.println(degree(g,1));System.out.println(edges(e));System.out.println(connected(g));path(g,0,4);System.out.println(selfLoop(e));}
}
