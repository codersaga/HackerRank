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
        int n=sc.nextInt(); sc.nextLine();
        String uord=sc.nextLine();
        int level=0;
        int valleys=0;
        boolean belowSea=false;
        for(int i=0;i<n;i++){
            char slope=uord.charAt(i);
            if(slope=='U')
                level++;
            else
                level--;
            if(!belowSea&&level<0){
                valleys++;
                belowSea=true;
            }
            if(level>=0)
                belowSea=false;
        }
        System.out.println(valleys);
    }
}
