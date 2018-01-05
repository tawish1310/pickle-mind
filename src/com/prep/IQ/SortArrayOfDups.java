package com.prep.IQ;

import java.util.Scanner;

/**
 * Given an array of Duplicates sort the array with decreasing frequency of elements. 
 * If two elements have the same frequency sort them by actual value of increasing order
 * Input [2 3 5 7 9 5 3 7]
 * ouput [3 3 3 5 5 7 7 2 9]
 * @author tnaqvi
 *
 */
public class SortArrayOfDups {
    
  public static void main(String[] args){
    
      int[] nums= {2,3,5,7,9,5,3,7,10,2};
     
      sortDups(nums);
     removeDups(nums);
     for(int i=0;i<nums.length-1;i++){
         System.out.println(nums[i]);
     }
     
  }

  
  /**
   * Sorting the array with duplicates this is bubble sort
   */
  public static void sortDups(int[] arr){
      
      for (int i = 0; i < arr.length; i++) {
          for (int j = i + 1; j < arr.length; j++) {
              int tmp = 0;
              if (arr[i] > arr[j]) { //1) 2>3 false //2) 3>5 false  //4)9>5 : true swap the position
                  tmp = arr[i];
                  arr[i] = arr[j];
                  arr[j] = tmp;
              } 
              
          }
        System.out.print(arr[i]);  
      }
  }
  
  /**
   * Removing the duplicates from the sorted array and resize it 
   */
  
  public static void removeDups(int[] array){
      int counter=0;
      for (int i=0;i<array.length-1;i++){
          if(array[i]!=array[i+1]){
              
              array[counter]=array[i]; //assign the non repeated element
              counter++;
          }
          array[counter]=array[array.length-1];
         
      }
      
  }
}
  
 