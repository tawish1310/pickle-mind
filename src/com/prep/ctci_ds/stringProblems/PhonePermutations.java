package com.prep.ctci_ds.stringProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *Given a digit string, return all possible letter combinations that the number could represent.
 A mapping of digit to letters (just like on the telephone buttons) is given below.
 Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * @author tnaqvi
 * @date Nov 29, 2017
 */
public class PhonePermutations {

    public List<String> letterCombinations(String digits) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        map.put(0, "");
     
        ArrayList<String> result = new ArrayList<String>();
     
        if(digits == null || digits.length() == 0)
            return result;
     
        ArrayList<Character> temp = new ArrayList<Character>();
        getString(digits, temp, result, map);
     
        return result;
    }
     
    public void getString(String digits, ArrayList<Character> temp, ArrayList<String> result,  HashMap<Integer, String> map){
        if(digits.length() == 0){
            char[] arr = new char[temp.size()];
            for(int i=0; i<temp.size(); i++){
                arr[i] = temp.get(i);
            }
            result.add(String.valueOf(arr));
            return;
        }
     
        Integer curr = Integer.valueOf(digits.substring(0,1));
        String letters = map.get(curr);
        for(int i=0; i<letters.length(); i++){
            temp.add(letters.charAt(i));
            getString(digits.substring(1), temp, result, map);
            temp.remove(temp.size()-1);//HINT
            
        }
    }
    
    
    public static void main(String[] args){
        PhonePermutations pm = new PhonePermutations();
        for(String s:pm.letterCombinations("3458")){
            System.out.print(s+"\t");
        }
    }
}
