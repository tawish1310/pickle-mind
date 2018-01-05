package CtCi.recursion_dp;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a method to compute permutations of a string with unique characters
 *ab!=ba
 *P(n,r)=n!/(n-r)! elsr P(n)=n!;
 *eg : abc =ab,ac,aa,ba,bc,bb,ca,cb,cc
 *Solution: Solve for n-1  for (a,b)
 *put in a char array and then insert
 *When the order does matter it is a Permutation.

 * @author tnaqvi
 *
 */
public class PermutationsOfString {
    
    public static void main(String[] args){
       ArrayList<String> l= new PermutationsOfString().getPerms("abcde");
      
       System.out.println(l.size());
       for(String s1:l){
           System.out.print(s1+",");
       }
    }
    
    public ArrayList<String> getPerms(String a){
        ArrayList<String> result= new ArrayList<String>();
        if(a.length()==0){
            result.add("");
            return result;
        }
        for(int i=0;i<a.length();i++){
            String s1=a.substring(0,i); //first character
            String s2=a.substring(i+1, a.length());
           ArrayList<String> perms= getPerms(s1+s2);
            for(String s:perms){
                result.add(a.charAt(i)+s);
            }
        }
        
        return result;
    }
    
  
    
    
}
