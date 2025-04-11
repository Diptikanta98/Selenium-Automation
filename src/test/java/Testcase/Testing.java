package Testcase;

import org.testng.annotations.Test;

import java.util.HashSet;

public class Testing {
    @Test
public void m1(){
    int n=1223424242;
    String s=n+"";
        HashSet<Character> ch=new HashSet<>();
    for(int i=0;i<s.length();i++){
        ch.add(s.charAt(i));
    }
    for(char c:ch){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i))
            count++;
        }
        System.out.println(c+"="+count);
    }
}
@Test
    public void m2(){
        int n=1523424242;
        HashSet<Integer> ch=new HashSet<>();
        int temp=n;

        while(true){
            ch.add(temp%10);
            temp=temp/10;
            if(temp==0)
                break;
        }
       // System.out.println(ch);

        for(Integer c:ch){
            int count=0;
            temp=n;
            //System.out.println(temp);
            while(true){
                int rem=temp%10;
                if(rem==c) {
                    count++;
                }
                temp=temp/10;
                if(temp==0)
                    break;
            }
            System.out.println(c+"="+count);
        }

    }
}
