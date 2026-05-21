import java.util.*;
class Main {
    public static int INF = 1000000000;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int E = in.nextInt();
        int[][] dist = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j)dist[i][j]=0;
                else dist[i][j]=INF;
            }
        }
        for(int i=0;i<E;i++){
            int s = in.nextInt()-1;
            int d = in.nextInt()-1;
            int w = in.nextInt();
            dist[s][d] = w;
        }
        for(int k=0;k<N;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    if(dist[i][k]<INF && dist[k][j]<INF){
                        dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(dist[i][j]==INF){
                    System.out.print("INF ");
                }
                else{
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
