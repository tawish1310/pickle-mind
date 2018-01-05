package com.prep.IQ;
import java.util.HashMap;



public class TestSocketBR {
    public static void main(String a[]){
        int[] arr1 = {10,34,4,56,7,67,88,42};
        int[] arr2 = doInsertionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
        
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
       // bubble_srt(input);
        //findAnangramString();
        //findPalindrome();
       
    }
     
    public static int[] doInsertionSort(int[] input){
        int temp=0;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    System.out.println(j+"::"+temp);
                    temp = input[j];
                    System.out.println(i+"****"+temp);
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
    
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
  
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        System.out.println("array[i]"+array[i]);
        temp = array[i];
        System.out.println("temp"+temp);
        array[i] = array[j];
        System.out.println("array[i]"+array[i]);
        array[j] = temp;
        System.out.println("array[j]"+array[j]);
    }
  
    private static void printNumbers(int[] input) {
          
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    /**
     * Find Anagrams
     */
    public static void findAnangramString(){
       HashMap map1= new HashMap();
       HashMap map2 = new HashMap();
      String str1="keep1";
      String str2="peek1";
      if(!(str1.length()==str2.length())){
          System.out.println("not matching lengths not an anagram");
          System.exit(1);
      }
      
      for(int i=0;i<str1.length();i++){
          char key=str1.charAt(i);
          char key2=str2.charAt(i);
          int charCount=0;int charCount2=0;
          
          map1.put(key,++charCount);
          map2.put(key2,++charCount2);
          
      }
      if((map1.equals(map2))){
      System.out.println("anagram");
        }
    }
    
   public static void findPalindrome(){
       String str1="keep1";
       String str2="peek1";
       int count=0;
       int i=0;
       int j=str2.length()-1;
       System.out.println("count"+count);
       
                  do{
                  if(str1.charAt(i)==str2.charAt(j)){
                  i++;
                  j--;
                  count++;
                  }
                  
                  }while(str1.charAt(i)!=str2.charAt(j));
              if(count==str1.length()){
                  System.out.println("palindrome");
              }
              else{
                  System.out.println("not a pailndrome");
              }
   }
  
}


