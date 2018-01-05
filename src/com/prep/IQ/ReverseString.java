package com.prep.IQ;

import java.util.Stack;
/**
 * Expedia Questions :  
 * @author tnaqvi
 *
 */
public class ReverseString {
Stack<String> stackString= new Stack<String>();


public static void main(String[]args){
   ReverseString rs= new ReverseString();
   rs.reverseString("The Sky is Blue");
}

public String reverseString(String s){
    String[] split=s.split("\\s");
    System.out.println(split.length);
    for(int i=0;i<split.length;i++){
        stackString.push(split[i]);
       
    }
    for(int j=1;j<=stackString.size();)
    System.out.println(stackString.pop());
   
    return new String();
}
}
