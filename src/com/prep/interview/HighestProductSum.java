package com.prep.interview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Asked in Expedia Interview : Sort and Compare
 * @author tnaqvi
 * @date Nov 24, 2017
 */
public class HighestProductSum {

    
   // static int[][] matrix={{2,4,5},{6,7,8},{12,13,14}};
    /**
     * We need to initialize a 2d Array and use it to solve the Zero Matrix problem and the Rotate Image Problem
     * row =arr[length] col=arr[i].length
     */
    public ArrayList<Integer> highestProductSubArray(ArrayList<Integer> elements){
        ArrayList<Integer> result= new ArrayList<Integer>();
        int size= elements.size()-1;
       Collections.sort(elements);
       // this is the hint right here sort and multiply the product of last 2
            int maxProduct=elements.get(size)*elements.get(size-1);
            result.add(0,elements.get(size));
            result.add(1,elements.get(size-1));
            
            for(int i=0;i<elements.size()-1;i++){
                int currentProduct=elements.get(i)*elements.get(i+1);
                if(currentProduct>maxProduct){
                    result= new ArrayList<Integer>();
                    result.add(0,elements.get(i));
                    result.add(1,elements.get(i+1));
                    
                }
                
        }
       
        return result;
    }
    
    public static void main(String[] args){
        HighestProductSum ma = new HighestProductSum();
        ArrayList<Integer> elements= new ArrayList<Integer>();
        elements.add(-3);
        elements.add(-4);
        elements.add(0);
        elements.add(2);
        elements.add(5);
        ArrayList<Integer> list=ma.highestProductSubArray(elements);
        for(Integer i:list){
            System.out.println(i);
        }
       
       }
    
    //sort array
    }
    
    

