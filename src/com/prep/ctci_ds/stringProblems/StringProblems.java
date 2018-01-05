package com.prep.ctci_ds.stringProblems;

public class StringProblems {
    
    public static void main(String[] args){
        StringProblems problems= new StringProblems();
        problems.isPalindrome("red rum, sir, is murder");//was it a cat I saw!= Was it a cat I saw : Char Ascii codes for lowercase and uppercase
    }

    /**
     * isUnique w/o additional DS 
     * This intializes the character array to contain all lowercase chars
     * and compare
     * @param s
     * @return
     */
    public boolean isUnique(String s){
        boolean isUnique=false;
        //s.con
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
          
                
            }
           return isUnique; 
        }
    /**
     * Palindrome : MADAM 
     * 
     */
       public boolean isPalindrome(String s1){
           boolean isPalindrome=false;
           int middle=0;
           int begin  = 0;
           int end    = s1.length() - 1;
            if(s1.length()%2==0) middle=s1.length()/2;
           else middle=s1.length()/2+1;
           for(int i=begin;i<=middle;i++){
               if(s1.charAt(begin)==s1.charAt(end)){
                  begin++;
                  end--;
                   isPalindrome=true;
               }
               else{
                   break;
               }
           }
           
           
           System.out.println(isPalindrome);
           return isPalindrome;
       }
       
       /**
        * Find location of a string 
        */
       public int findLocation(){
           String [] args={"at","","","ball"};
           String s1="ball";
           if(args.length==1) return 0;
           
           for(int i=0;i<args.length;i++){
               String s=args[i];
               if(s1.equals(s)) return i;
           }
           return 1;
           
       }
       
    }

