package com.prep.ctci_ds.stringProblems;

import java.util.ArrayList;
import java.util.List;

/** This problem has been asked multiple times in one form or the other
 * Typical Forms include: Max Profit .Buy or Sell
 * find longest subarray with max values
 * 
 * @author tnaqvi
 * @date Dec 3, 2017
 */
public class MaxSubarrayImp {

    /**
     * Divide into L n R
     * Base case
     * left half recursion : write helper function
     * right half recursion
     * compare left and right max values
     * 
     */
    public int maxSubArray(int[] nums){
        int maxRightSum=Integer.MIN_VALUE; int maxLeftSum=Integer.MIN_VALUE;
        int low=0; int high=nums.length; 
        int middle=(high+low)/2;
       int leftArraySum=0; int rightArraySum=0;
       List<Integer> listOfIndex= new ArrayList<Integer>();
       
        if(high==low) return nums[low];
        else {
            for(int i=middle;i>low;i--){
                 leftArraySum+=nums[i];
                if(leftArraySum>maxLeftSum){
                    maxLeftSum=leftArraySum;
                listOfIndex.add(i);
                }
            }
            
            for(int j=middle+1;j<high;j++){
                rightArraySum+= nums[j];
                if(rightArraySum>maxRightSum){
                    maxRightSum=rightArraySum;
                    listOfIndex.add(j);
                    
                }
            }
            
        }
        return maxLeftSum+maxRightSum;
    }
    
    private int maxSubArray(int array[],int low,int high){
       int middle=(high+low)/2;
       int leftMax=maxSubArray(array,0,middle);//infinite loop
       int rightMax=maxSubArray(array,middle+1,high);
       
       return leftMax+rightMax;
    }
}
