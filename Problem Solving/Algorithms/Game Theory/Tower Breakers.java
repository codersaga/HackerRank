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
            int m=sc.nextInt();
            if(m==1){
                System.out.println(2);
            }
            else if(n%2==0){
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
