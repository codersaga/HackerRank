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

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int totalCost=0;
        int allergicCost=0;
        for(int i=0;i<n;i++){
            int item=sc.nextInt();
            if(i==k){
                allergicCost=item;
            }
            totalCost+=item;
        }
        int charged=sc.nextInt();
        if(charged==totalCost/2){
            System.out.println(allergicCost/2);
            System.exit(0);
        }
        System.out.println("Bon Appetit");
    }
}
