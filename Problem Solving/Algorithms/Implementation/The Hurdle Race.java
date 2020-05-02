import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,sc.nextInt());
        }
        if(k-max<0)
            System.out.println(Math.abs(k-max));
        else
        System.out.println(0);
    }
}
