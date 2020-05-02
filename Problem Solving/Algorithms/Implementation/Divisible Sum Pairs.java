import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int l=0;l<n;l++){
            a[l]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(i!=j&&(a[i]+a[j])%k==0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
 
}
