import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        d%=n;
        int idx=n-1-d;
        reverse(a,0,n-1);
        reverse(a,0,idx);
        reverse(a,idx+1,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
    private static void reverse(int[] a,int start,int end){
        if(a==null||start<0||start>=a.length||end<0||end>=a.length){
            return;
        }
        while(start<end){
            swap(a,start++,end--);
        }
    }
    private static void swap(int [] a,int i,int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
        
