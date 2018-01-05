package com.prep.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Asked at Zulily
 * Write me a function, that takes in a sentence as a parameter, and returns the words in the sentence that repeat.

 * @author tnaqvi
 * @date Jan 4, 2018
 */
public class FindRepeatedWords {

    
public static void main(String[] args){
    
    FindRepeatedWords fr= new FindRepeatedWords();
    fr.findRepeatedWords("This is a good day is a nice day");
}

public Set<String> findRepeatedWords(String text){
        Map<String,Integer> frequentWordMap= new HashMap<String,Integer>();
        Set<String> listofWords= new HashSet<String>();
        if(text.length()==0) 
        return new HashSet<String>();
         String[] word=text.split("\\s");
         for(int i=0;i<word.length;i++){
         
            if(frequentWordMap.containsKey(word[i])){
            frequentWordMap.put(word[i],frequentWordMap.get(word[i])+1);
            System.out.println(word[i]);
            listofWords.add(word[i]);
            }
            else frequentWordMap.put(word[i],1);
        }
        return listofWords; 
}


}
