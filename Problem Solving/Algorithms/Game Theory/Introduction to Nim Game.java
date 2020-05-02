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
        int g=sc.nextInt();
        for(int q=0;q<g;q++){
            int n=sc.nextInt();
            int a[]=new int[n];
            int ans=0;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                ans=ans^a[i];
            }
            if(ans==0){
                System.out.println("Second");
            }
            else{
                System.out.println("First");
            }
        }
    }
}
