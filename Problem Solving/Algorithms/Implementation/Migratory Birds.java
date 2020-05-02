import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution{
    static int migratoryBirds(int[] ar){
        Arrays.sort(ar);
        return ar[5];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[6];
        int[] arr=new int[6];
        Arrays.fill(ar,0);
        for(int j=0;j<n;j++){
            int temp=sc.nextInt();
            ar[temp]++;
            arr[temp]++;
        }
        int max=migratoryBirds(ar);
        for(int i=0;i<6;i++){
            if(arr[i]==max){
                System.out.println(i);
                break;
            }
        }
    }
}
