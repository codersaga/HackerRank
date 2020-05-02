import java.io.*;
import java.util.*;
import java.lang.Math;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int q=0;q<t;q++){
            int c=sc.nextInt();
            if(c%2==0){
                System.out.println((int)(Math.pow(2,c/2)*2)-1);
            }
            else{
                System.out.println((int)((Math.pow(2,(c-1)/2)*2)-1)*2);
            }
        }
    }
}
