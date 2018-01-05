package com.prep.ctci_ds.stringProblems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * THis is a problem where for any given time there is a small data that is exposed/present in the array
 * the index keeps on sliding from L->R eg: SPlunk search between a given time: Explore the data within that
 * window size to get information. 
 * @author tnaqvi
 *
 */
public class SlidingWindow {
    
    
    /**
     * brute force O(n^2)
     * @param arr
     * @param windowSize
     */
    public void slideWindow(int[] arr, int windowSize){
        int max=0;
       for(int i=0;i<arr.length-windowSize;i++){
            max=arr[i];
            for(int j=i+1;j<i+windowSize;j++){
                if(arr[j]>max){
                    max=arr[j];
                   
                }               
            }
        }     
       System.out.println(max);
    }
    
/**
 * using heaps or Deque : This helps remove elements from the start and end
 * O(lengthofarray)-> For loop
 * O(1)-> pop and push operations
 * Is window size playing a role in the O()? THIS IS SO CONFUSING :
 */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0) return new int[0];
        LinkedList<Integer> window = new LinkedList<>();
                int[] res = new int[nums.length - k + 1]; //initialize the array result
        
        for(int i = 0; i < nums.length; i++) {
            if(window.size() > 0 && window.peekFirst() == i - k) {
                window.pollFirst(); //remove the first item 
            }
            while(window.size() > 0 && nums[window.peekLast()] <= nums[i]) { //compare the values of the last element with array
                window.pollLast(); //remove the last item
            }
            window.add(i); //add the index since that is sliding across 
            if(i - k + 1 >= 0) {
                res[i - k + 1] = nums[window.peekFirst()];
                
            }
            
        }
       
        
        return res;
    }
    
    /**
     * THANKS ZAHID BHAI for this solution , makes so much sense to split the array into subarrays of window size
     * @param s
     * @return
     */
    
    public int[] slidingWindowZahid(int[] array, int k){
        int max_left[]=new int[array.length];
        int max_right[]= new int[array.length];
         int[] sliding_max = new int[array.length -k+ 1];
        
        max_left[0] = array[0];
        max_right[array.length-1] = array[array.length - 1];

        for(int i=1;i<array.length;i++){
            max_left[i]=(i % k==0)?array[i]:Math.max(max_left[i - 1], array[i]);
            int j=array.length-i-1;
            max_right[j] = (j % k == 0) ? array[j] : Math.max(max_right[j + 1], array[j]);
        }
        for (int i = 0, j = 0; i + k <= array.length; i++) {
            sliding_max[j++] = Math.max(max_right[i], max_left[i + k - 1]);
        }
        return sliding_max;
    }
    
   
        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>(); // current index of character
            // try to extend the range [i, j]
            for (int j = 0, i = 0; j < n; j++) {
                if (map.containsKey(s.charAt(j))) {
                    i = Math.max(map.get(s.charAt(j)), i);
                }
                //what does it do ??
                ans = Math.max(ans, j - i + 1);
                map.put(s.charAt(j), j + 1);
            }
            System.out.println("is the answer"+ans);
            return ans;
        }
        
        public static void main(String[] args){
            int windowSize=3;
            int [] arr={2,4,5,6,7,3,48,11,34,6,0};
            new SlidingWindow().slideWindow(arr, windowSize);
           int [] result= new SlidingWindow().maxSlidingWindow(arr, windowSize);
          for(int j=0;j<result.length;j++){
              System.out.print(result[j]+",");
          }
          new SlidingWindow().lengthOfLongestSubstring("aaabbcc");
        }
        
    }
    

