package com.prep.ctci_ds.stringProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a string ,print all the character combinations.
 * @author tnaqvi
 * @date Jan 2, 2018
 */
public class CombinationsStrings {

    Set<String> strCombinations = new HashSet<String>();
    public String printCombinations(String s){
        //if(s.length()==0) return "";
         return combinations("", s);
         //return strCombinations;
    }
    /**
     * 
     * @param prefix
     * @param s
     * @return
     */
    public String combinations(String prefix,String s){
       for(int i=0;i<s.length();i++){
          combinations(prefix+s.charAt(i),s.substring(i+1));
          strCombinations.add(prefix);
       }
       return strCombinations.toString();
    }
    
    
    public static void main(String[] args){
        CombinationsStrings c = new CombinationsStrings();
        String s = "tawish";
      c.printCombinations(s);
      for(String s1:c.strCombinations){
          System.out.println(s1);
      }
    }
       
    }

