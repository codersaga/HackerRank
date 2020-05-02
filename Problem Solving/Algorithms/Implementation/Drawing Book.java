import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int beg=(p/2);
        int end=0;
        if(n%2==1)
            end=(n-p)/2;
        else
            end=(int)Math.ceil((n-p)/2.0);
        System.out.println(Math.min(beg,end));
    }
}
