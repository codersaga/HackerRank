import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n,int[][] q){
        long[] precom=new long[n];
        for(int i=0;i<q.length;i++) {
            int a=q[i][0]-1;
            int b=q[i][1]-1;
            int k=q[i][2];
            precom[a]+=k;
            if(b+1<n){
                precom[b+1]-=k;
            }
        }
        long max=0;long sum=0;
        for(int i=0;i<n;i++) {
            sum+=precom[i];
            max=Math.max(max,sum);
        }
        return max;
    }
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] nm = scanner.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] q = new int[m][3];
        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                q[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n,q);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
