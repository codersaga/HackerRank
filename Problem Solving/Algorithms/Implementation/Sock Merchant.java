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
        HashMap sockstore=new HashMap<Integer,Integer>();
        int matchingPairs=0;
        
        for(int i=0;i<n;i++){
            int color=sc.nextInt();
            if(sockstore.containsKey(color)&&sockstore.get(color).equals(new Integer(1)))            {
                sockstore.put(color,0);
                matchingPairs++;
                continue;
            }
            sockstore.put(color,1);
        }
        System.out.println(matchingPairs);
    }
}
