import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int noOfJumps=0, i = 0;
        while(true){
            if(i+2<n&&a[i+2]==0){
                i+=2;
            }
            else if(i+1<n) {
                i++;
            }
            else{
                break;
            }
            noOfJumps++;
        }
        System.out.println(noOfJumps);
    }
}
