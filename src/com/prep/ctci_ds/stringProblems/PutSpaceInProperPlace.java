package com.prep.ctci_ds.stringProblems;

import java.util.HashSet;
import java.util.Set;

/**
 * You have accidentally deleted spaces from a textfile .Write a program to put those spaces in the legit places to 
 * form the text
 * @author tnaqvi
 * @date Dec 15, 2017
 */
public class PutSpaceInProperPlace {
    
    StringBuffer correctedText= new StringBuffer();
    String correctedword="";
    /**
     * Questions Asked : Do I have a Set/Dict/list to compare the words to ? Yes
     * That means the after every character we add space and compare with the words in the Set/Dict/List
     * @param args
     */
    
    public String correctTextWithCorrectSpaces(HashSet<String> dictionary,String line,int start){
       
        System.out.println("Start index is "+start);
        if(line.length()==0){
           return line;
        }
        if(start==line.length()) {
            System.out.println(":::");
            
            return correctedText.toString();
        }
         //wg line :iamusefull
        
        int index=start;
        while(index!=line.length()){
        Character c=line.charAt(index);
        correctedword += c;
        if(dictionary.contains(correctedword)){
            correctedText.append(correctedword);
            correctedText.append(" ");
           // 
            
        }
        index++;
        
        //System.out.println(correctedword);
        correctTextWithCorrectSpaces(dictionary,line,index);
        }
        //System.out.println(":::"+correctedText.toString());
        correctedword= new String();
        return correctedText.toString();
    }

    public static void main(String[] args) {
        PutSpaceInProperPlace psipp= new PutSpaceInProperPlace();
        HashSet<String> dictionary= new HashSet<String>();
        //dictionary.add("");
        dictionary.add("am");
        dictionary.add("usefull");
        dictionary.add("full");
        dictionary.add("use");
        
        String line="Iamusefull";
        int start=0;
       String result=psipp.correctTextWithCorrectSpaces(dictionary, line, start);
       System.out.println(result.length());

    }

}
