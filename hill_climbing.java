import java.util.Scanner;
public class hillclimbing {
    public static void main(String args[]){
        int n,i,j;
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter number of nodes in graph");
        n = sc.nextInt();
        int[][]graph = new int[n][n];
        for (i=0;i<n;i++)
        for(j=0;j<n;j++)
        graph[i][j]=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print("Is"+i+"is connnected to "+j);
                graph[i][j]=sc.nextInt();
            }
        }
        System.out.print("The adjacency matrix is:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(graph[i][j]+"\n");
                
            }
        }
    }
}
