import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> frequencies = new HashMap<>();
        for(int i=0; i < n; i++){
            int num = in.nextInt();
            if(frequencies.containsKey(num))
                frequencies.put(num, frequencies.get(num)+1);
            else
                frequencies.put(num, 1);
            
        }
        int maxSet = 0;
        
        for(int i : frequencies.keySet())
        {
            int left = (frequencies.containsKey(i-1)) ? frequencies.get(i) + frequencies.get(i-1) : frequencies.get(i);
            int right = (frequencies.containsKey(i+1)) ? frequencies.get(i) + frequencies.get(i+1) : frequencies.get(i);
            
            if(left > maxSet)
                maxSet = left;
            if(right > maxSet)
                maxSet = right;
        }
        System.out.println(maxSet);
    }
}
