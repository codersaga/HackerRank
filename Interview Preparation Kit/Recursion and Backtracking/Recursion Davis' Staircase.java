import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static HashMap<Integer,Integer> hm=new HashMap();
    private static int staircase(int n) {
        if(n<0){
            return 0;
        }
        if(hm.containsKey(n)){
            return hm.get(n);
        }
        int ways=staircase(n-1)+staircase(n-2)+staircase(n-3);
        hm.put(n,ways);
        return ways;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        hm.put(0,1);
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(staircase(n));
        }
    }
}
