package com.prep.ctci.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Find a longest subsequence from an array of int and letters. The subSeq should contain equal number of 
 * letters and numbers
 * @author tnaqvi
 * @date Dec 17, 2017
 */
public class FindLongestSubSequenceLetterNumber {

  /**  public char[] subsequence(char[] array){
        Map charMap= new HashMap<String, Integer>();
        Map intMap= new HashMap<String,Integer>();
        int charCounter=0;int numberCounter=0;
        
        
        for(int i=0;i<array.length;i++){
            if(Character.isDigit(array[i])){
                intMap.put("int", numberCounter++);
            }
            else charMap.put("char", numberCounter++);
            list.add(array[i]);
            if(charMap.get("char")==intMap.get("int")){
              
            }
        }
    }**/
    
    /**
     * ctci solution 
     */
    
    char[] findLongestSubArray(char[] array){
         int[] diffArray=computeDifferenceArray(array);
         int[] maxDiffBetweenIndex= findLongestSubArrayMatch(diffArray);
         return extractsubArray(array, maxDiffBetweenIndex[0]+1, maxDiffBetweenIndex[1]); // adding 1 since tge index value stored in max is intialized to -1
    }
    
    public int[] computeDifferenceArray(char[] array){
        int[] diffArray = new int[array.length];
        int difference=0;
        for(int i=0;i<array.length;i++){
            if(Character.isLetter(array[i])){
                difference++; //increase if there is a letter 
            }
            else if(Character.isDigit(array[i])) {
                //System.out.println("true");
                difference--; 
            }
            //this else if is incase the array contains anything other than letter/digits
            diffArray[i]=difference;
        
        }
        return diffArray;
    }
    /**
     * 
     * @param diffArray
     * @return
     */
    int[] findLongestSubArrayMatch(int[] diffArray){
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        map.put(0,-1); //dont understand y 
        int[] max= new int[2];
        for(int i=0;i<diffArray.length;i++){
            if(!map.containsKey(diffArray[i])){
                map.put(diffArray[i],i);
            }else{
                int match=map.get(diffArray[i]);//i=1 ; map.get(0) since diffArray[1]=0
                int distance=i-match;
                int longest=max[1]-max[0];
                if(distance>longest){
                    max[1]=i;
                    max[0]=match;
                }
            }
        }
        return max;
                }
    
    /**
     * extract array
     */
    public char[] extractsubArray(char[] array,int start,int end){
        char[] subarray= new char[end-start+1];
        for(int i=start;i<end;i++){
           subarray[i-start]=array[i]; 
        }
        return subarray;
    }
    
    
    public static void main(String[] args){
        char[] charArray={'a','1','b','2','3','4','5','c','d','f'};
        FindLongestSubSequenceLetterNumber fs= new FindLongestSubSequenceLetterNumber();
        
        char[] output=fs.findLongestSubArray(charArray);
        System.out.println(output);
    }
    
            }
