import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                s=s.substring(0,i-1)+s.substring(i+1);
                i=0;
            }
        }
        if(s.length()==0){
            System.out.print("Empty String");
        }
        else {
            System.out.print(s);
        }
    }
}      
