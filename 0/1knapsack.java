import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int P[] = new int[n];
    int wt[] = new int[n];
    for(int i=0;i<n;i++)P[i]=in.nextInt();
    for(int i=0;i<n;i++)wt[i]=in.nextInt();
    int[][] dp = new int[n+1][m+1];
    for(int i=0;i<n;i++){
      for(int w=0;w<m;w++){
        if(i==0||w==0) dp[i][w] = 0;
        else if(w>=wt[i-1]) dp[i][w] = Math.max(P[i-1]+dp[i-1][w-wt[i-1]],dp[i-1][w];
        else dp[i][w] = dp[i-1][w];
      }
    }
    System.out.println(dp[n][m]);
  }
}
