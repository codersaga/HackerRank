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
        int t=sc.nextInt();
        for(int q=0;q<t;q++){
            int n=sc.nextInt();
            if(n==1){
                System.out.println("Second");
            }
            else if(n%7==0||n%7==1)
                System.out.println("Second");
            else{
                System.out.println("First");
            }
        }
    }

}
