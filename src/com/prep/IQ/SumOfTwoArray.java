package com.prep.IQ;


/**
 * THis came as a question in the interview and first
 * @author tnaqvi
 *
 */
public class SumOfTwoArray {
    
    public static void main(String [] args){
        int[] array={2,4,5,6,7,8};
     new SumOfTwoArray().twoSum(array, 15);
    }
    public int[] twoSum(int[] nums, int target) {
        int[] indicesArray= new int[2];
        for(int i=0;i<nums.length;i++){
           
            int sum=nums[i]+nums[i+1];
            
            if(target==sum){
                System.out.println("Equal S");
                indicesArray[0]=nums[i];
                indicesArray[1]=nums[i+1];
                break;
            }
           
        }
        System.out.println(indicesArray[0]+"::"+indicesArray[1]);
        return indicesArray;
       
    }
}
    
