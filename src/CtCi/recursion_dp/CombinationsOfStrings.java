package CtCi.recursion_dp;

import java.util.ArrayList;

/**
 * Data Structures in Java Problem
 * : Print Combinations of all strings : ab==ba
 * C=n!(r!*(n-r)!)
 * @author tnaqvi
 *When the order doesn't matter, it is a Combination.

 */
public class CombinationsOfStrings {

    public static void main(String[] args){
    ArrayList<String> l= new CombinationsOfStrings().permutation("abcde");
    System.out.println(l.size());
    for(String s1:l){
        System.out.print(s1+",");
    }
    }
    public ArrayList permutation(String s){
        ArrayList list = new ArrayList<String>();
        
       if(s.length()==1){
           list.add(s);
           return  list;
       }
       else{
           int lastIndex=s.length()-1;
          String lastChar=s.substring(lastIndex);
          String allExceptLast=s.substring(0, lastIndex);
          // we need to make a list of string with all the characters but last and then recurse
         list= permutate(permutation(allExceptLast),lastChar);
       }
       return list;
    }
    
    public ArrayList permutate(ArrayList<String> list,String c){
        ArrayList result = new ArrayList<String>();
        for(String s:list){
            for(int i=0;i<s.length();i++){
                String buffer= new StringBuffer(s).insert(i, c).toString();
                result.add(buffer);
            }
        }
        return result;
    }
}

