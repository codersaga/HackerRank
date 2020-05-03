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
        int N=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> map=new HashMap();
        for (int i=0;i<N;i++) {
            String str=sc.nextLine();
            map.merge(str,1,Integer::sum);
        }
        int Q=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<Q;i++) {
            String str=sc.nextLine();
            System.out.println(map.getOrDefault(str,0));
        }
    }
}
