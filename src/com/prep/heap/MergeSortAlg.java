package com.prep.heap;

import java.util.Collections;

/**
 * In Merge sort 1) Break the list into 2 halves : Left and Right
 * middle =n/2 or (n+1)/2
 * Left -> 0-mid
 * Right->mid->n-1
 * Merge the 2 halves by comparing the elements in each sub-array with main Array and start rewriting the values
 * at indices of the original arrays
 * @author tnaqvi
 * 
 * */
public class MergeSortAlg {
   
    static int counter=0;
    public static void mergeSort(int[] array){
        mergeSort(0,array.length-1,array);
    }
    public static void mergeSort(int leftStart,int rightEnd,int[] originalArray){
       // System.out.println("left start::"+leftStart+"::right end::"+rightEnd);
        //Collections.binarySearch(list, key, c)
        int middle=(leftStart+rightEnd)/2;
       
        if(leftStart>=rightEnd){ // its sorted ?
            return;
        }
        System.out.println("111::lefStart:"+leftStart+":middle:"+middle);
        mergeSort(leftStart,middle,originalArray);
        System.out.println("222::middle:"+middle+":rightEnd:"+rightEnd);
        mergeSort(middle+1,rightEnd,originalArray);
        System.out.println("333::leftSTart:"+leftStart+"rightEnds::"+rightEnd);
        //repeated call to merge2 halves
        
       mergeHalves(leftStart,rightEnd,originalArray); //like any other function call
    }
    /**
     * merge 2 sub arrays this will not call its ownself 
     * @param leftStart
     * @param rightEnd
     * @param array
     */
    public static void mergeHalves(int leftStart,int rightEnd,int[] array){
        System.out.println("");
        System.out.println(leftStart+"mergin halves"+rightEnd);
       int temp[]= new int[array.length];
       int leftEnd=(rightEnd+leftStart)/2; //this is the end for the Left Sub array
       int rightStart=leftEnd+1;
       int size=rightStart-leftEnd+1;
       
       //Avoid re-assignment by using the same vars , just keeping it here for code clarity
       int left=leftStart;
       int right=rightStart;
       int index=leftStart;
      //as long as leftstart <leftend and rightStart<rightEnd: compare and addign values to the temp array
       while(left<=leftEnd && right<=rightEnd){
           if(array[left]<=array[right]){
               temp[index]=array[left];
           left++;
         
       }
           else{
               temp[index]=array[right];
               right++;
                          }
    index++;
    }
       //remaining element copy
       System.arraycopy(array, left, temp, index, leftEnd-left+1);
       System.arraycopy(array, right, temp, index, rightEnd-right+1);
       System.arraycopy(temp,leftStart,array,leftStart,size);
      for(int i=0;i<temp.length;i++){
         
          System.out.print(temp[i]+",");
      }
      System.out.println('\n');
    }
    
    public static void main(String[] args){
        int[] array= {6,5,7,90,14,56,89,91};
       
        mergeSort(array);
       
    
    }
}
