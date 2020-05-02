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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=0;
        int p[]=new int[k];
        for(int i=0;i<n;i++){
            int a=sc.nextInt()%k;
            p[a]+=1;
        }
        ans+=(p[0]>=1)?1:0;
        ans+=(k%2==0&&p[k/2]>=1)?1:0;
        int maxa=0;
        if(k%2==0){
            maxa=(k/2)-1;
        }
        else{
            maxa=k/2;
        }
        for(int i=1;i<=maxa;i++){
            ans+=Math.max(p[i],p[k-i]);
        }
        System.out.println(ans);
    }
}
