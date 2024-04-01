package 洛谷;
import java.util.*;
//1:无需package
//2: 类名必须Main, 不可修改
public class 发现环优秀题解 {
 static int n;    //节点数量
 static ArrayList<Integer>[] graph;    //邻接表
 static int[] du;    //入度数组
 static int[] vis;    //访问数组 （0 ： 未访问    1 ： 访问）

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     n = sc.nextInt();
     
     //初始化邻接表
     graph = new ArrayList[n+1];
     for(int i = 1; i<= n ;i++) {
         graph[i] = new ArrayList<>();
     }
     //初始化度和访问数组
     du = new int[n+1];
     vis = new int[n+1];
     
     
     
     for(int i = 1; i <= n ; i++) {//构建边和数组
         
         int x = sc.nextInt();
         int y = sc.nextInt();
         
         graph[x].add(y);//由于是无向的，所以存储2次
         graph[y].add(x);//complete
         
         du[x]++;//入度++；
         du[y]++;//因为是无向的，入度++
         
     }
     
     sortAll();//!!
     
     ArrayList<Integer> ans = new ArrayList<>();//存储包含环的节点
     
     for(int i = 1; i <=n ; i++) {
         if(vis[i] == 0) {//vis[i] = 0;说明入度不为0，这些节点在环上
             ans.add(i);//加入集合
         }
     }
     Collections.sort(ans);//一定要使用Collections.sort集合排序
     for(int i : ans) {
         System.out.print(i+" ");
     }
     
     
 }
 
 public static void dfs(int c) {//dfs                                                                             
     
     vis[c] = 1;//把该节点标记为已经访问，度为1
     
     for(int i : graph[c]) {//遍历其邻节点
         du[i]--;//邻节点的入度-1
         if(du[i] == 1) {//如果此时该邻节点的入度为1
             dfs(i);//从该邻节点继续找
         }
     }
 }
 public static void sortAll() {//拓扑排序
     
     for(int i = 1; i <=n;i++) {
         if(du[i] == 1) {
             dfs(i);
         }
     }
 }
}