import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int a1[]=new int[n1];
        int a2[]=new int[n2];
        int a3[]=new int[n3];
        Stack<Integer> st1=new Stack();
        Stack<Integer> st2=new Stack();
        Stack<Integer> st3=new Stack();
        for(int i=0;i<n1;i++)
        a1[i]=sc.nextInt();
        for(int i=0;i<n2;i++)
        a2[i]=sc.nextInt();
        for(int i=0;i<n3;i++)
        a3[i]=sc.nextInt();
        int sum1=0,sum2=0,sum3=0;
        for(int i=n1-1;i>=0;i--){
            
            sum1+=a1[i];
            st1.push(a1[i]);
        }
        for(int i=n2-1;i>=0;i--){
            
            sum2+=a2[i];
            st2.push(a2[i]); 
        }
        for(int i=n3-1;i>=0;i--){
            
            sum3+=a3[i];
            st3.push(a3[i]);
        }
        while(!(sum1==sum2&&sum2==sum3&&sum3==sum1)){
            if(sum1==0||sum2==0||sum3==0){
                sum1=0;
                break;
            }
            else if(sum1>=sum2&&sum1>=sum3){
                sum1-=st1.peek();
                st1.pop();
            }
            else if(sum2>=sum1&&sum2>=sum3){
                sum2-=st2.peek();
                st2.pop();
            }
            else if(sum3>=sum1&&sum3>=sum2){
                sum3-=st3.peek();
                st3.pop();
            }
        }
        System.out.println(sum1);
    }
}
