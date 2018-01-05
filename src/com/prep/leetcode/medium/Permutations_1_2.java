package com.prep.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Pemutate-1: Given a collection of Distinct numbers, return all possible permutations.
 * Permutate-2 : Given a collection of numbers, return all possible permutations.(Non-distinct)
 * @author tnaqvi
 * @param <List>
 * @date Nov 24, 2017
 */
public class Permutations_1_2 {
    

    public List<List<Integer>> permutateDistinctNumbers(int[] num){
        List<List<Integer>> resultList= new ArrayList<List<Integer>>();
        permute(num,0,resultList);
        return resultList;
       
    }
    
    void permute(int[] num, int start, List<List<Integer>> resultList) {
        
        for(int j=start;j<num.length-1;j++){
            swap(num, start, j);
            permute(num, start + 1, resultList);
            swap(num, start, j);
        }
        
    }
    
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static void main(String[] args){
        Permutations_1_2 perm = new Permutations_1_2();
        int[] arr={1,2,3,4,5,6};
        List<List<Integer>> list=perm.permutateDistinctNumbers(arr);
        System.out.println(list.size());
        for(List<Integer> list1:list){
            for(Integer i:list1){
                System.out.println(i);
            }
        }
    }
}
