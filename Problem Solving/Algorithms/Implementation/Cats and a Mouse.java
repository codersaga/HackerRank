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
        int q=sc.nextInt();
        for(int a=0;a<q;a++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int diffA=Math.abs(x-z); 
            int diffB=Math.abs(y-z); 
            if(diffA<diffB)
                System.out.println("Cat A");
            else if(diffB<diffA)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}
