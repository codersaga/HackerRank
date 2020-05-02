import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=26;
        int h[]=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        String w=sc.next();
        int maxh=0;
        for(int i=0;i<w.length();i++){
            if(maxh<h[w.charAt(i)-97]){
                 maxh=h[w.charAt(i)-97];
            }
        }
        System.out.println(w.length()*maxh);
    }
}
