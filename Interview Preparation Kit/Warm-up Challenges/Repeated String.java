import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long n=sc.nextLong();
        long count=0;
        long totalCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        long full=n/s.length();
        totalCount+=full*count;
        long left=n%s.length();
        for(int i=0;i<left;i++){
            if(s.charAt(i)=='a'){
                totalCount++;
            }
        }
        System.out.println(totalCount);
    }
}
