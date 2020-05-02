import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        Integer[] keyboards=new Integer[n];
        for(int ki=0;ki<n;ki++){
            keyboards[ki]=sc.nextInt();
        }
        int[] pendrives=new int[m];
        for(int pi=0;pi<m;pi++){
            pendrives[pi]=sc.nextInt();
        }
        Arrays.sort(keyboards,Collections.reverseOrder());
        Arrays.sort(pendrives);
        int max=-1;
        for(int i=0,j=0;i<n;i++){
            for(;j<m;j++){
                if(keyboards[i]+pendrives[j]>s) break;
                if(keyboards[i]+pendrives[j]>max)
                    max=keyboards[i]+pendrives[j];
            }
        }
        System.out.println(max);
    }
}
