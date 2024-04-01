package 蓝桥;

import java.util.Scanner;

/**
 * 3540 合并石子
 * 1.典型的动态规划题目，难点在于相邻两堆石子合并后，对于数组的变化
 * 解决：用三维数组dp,完美的存储了从i到j堆，且颜色为c的最少花费数
 * 2.如何进行动态规划，把大问题划分成小问题进行解决
 * 解决：第一轮先合并相邻的两个颜色相同石碓，找到最小值
 *      第二轮合并相邻的三个颜色相同的石碓，找到最小值
 *      依次往上合并，最终的答案也就是最小值
 *
 * 具体思路从迷你滨大佬学习而来：https://blog.dotcpp.com/a/96176
 */
public class Lanqiao3540合并石子 {
    static int maxValue = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][][] dp = new int[n + 1][n + 1][3]; //dp[i][j][c] 表示从i到j且颜色为c的石碓合并后所花费的最小石头数
        int[] sum = new int[n + 1];              //sum[i] 表示从第1堆到第i堆的石头数之和
        int[][] nums = new int[n + 1][n + 1];    //nums[i][j] 表示从i到j合并后的最小堆数 ，即第一个输出答案
        int[][] cost = new int[n + 1][n + 1];    //cost[i][j] 表示从i到j合并后的所花费的最小石头数，即第二个输出答案

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                nums[i][j] = j - i + 1;     //初始化从i到j的堆数和
                for (int c = 0; c < 3; c++) {
                    dp[i][j][c] = maxValue; //全部石碓初始化为maxValue方便判断
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            dp[i][i][in.nextInt()] = 0; //初始化存在的石碓，值为0，显然没有合并的每一个独立的石碓花费为0
        }
        //len、i、j三者的关系，其实就是表示每一轮是合并相邻两堆还是三堆...依次往上加
        for (int len = 2; len <= n; len++) {
            for (int i = 1; i + len - 1 <= n; i++) {
                int j = i + len - 1;
                for (int c = 0; c < 3; c++) { //三种颜色
                    int min = maxValue;
                    //k表示如何合并，如 i==1 j==3 ，此时是一轮合并相邻三堆（这里三堆指的是最原始没有合并过的，如1 2 3）
                    //在这一轮合并前已经合并过相邻两堆：1 23 和 12 3，所以这里合并成123 只需要靠k来判断1 23 和12 3谁更少
                    for (int k = i; k < j; k++) {
                        //判断两堆石碓是否合法存在，如果值为maxValue，则表示不存在；只有两堆都存在才能合并
                        if (dp[i][k][c] != maxValue && dp[k + 1][j][c] != maxValue) {
                            min = Math.min(min, dp[i][k][c] + dp[k + 1][j][c] + sum[j] - sum[i - 1]);
                        }
                    }
                    if (min == maxValue) {
                        continue;
                    }
                    //找到最优合并后的值min
                    dp[i][j][(c + 1) % 3] = Math.min(dp[i][j][(c + 1) % 3], min);
                    //合并后 从第i堆到第j堆成为1堆
                    nums[i][j] = 1;
                    //合并后 从第i堆到第j堆找到最少的花费
                    cost[i][j] = Math.min(dp[i][j][0], Math.min(dp[i][j][1], dp[i][j][2]));
                }
            }
        }
        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= k; i++) {
                for (int j = k + 1; j <= n; j++) {
                    //找到从i到j堆中，合并过后的,最少堆数，在此最少堆数的基础上再找对应的最少花费
                    if (nums[i][j] > nums[i][k] + nums[k + 1][j]) {
                        nums[i][j] = nums[i][k] + nums[k + 1][j];
                        cost[i][j] = cost[i][k] + cost[k + 1][j];
                    } else if (nums[i][j] == nums[i][k] + nums[k + 1][j]) {
                        //如果堆数相同，则找到最少的花费
                        cost[i][j] = Math.min(cost[i][j], cost[i][k] + cost[k + 1][j]);
                    }
                }
            }
        }
        System.out.println(nums[1][n] + " " + cost[1][n]);
        in.close();
    }
    
}