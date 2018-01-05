 package com.prep.trees;

public class Multiplication {
    
    public static void  main(String[] args){
        //Initiliaze a 2D array
        int arr[][]={{1,5,3},{2,4,5},{4,4,5}};//(r0c0)(r0c1){(0 0),(0 1),(0 2)}
        System.out.println(arr.length); //3
        System.out.println(arr[0].length);//4 first row
        int lastRow=arr.length-1;
        int lastCol=arr[0].length-1;
        System.out.println("last Row::"+lastRow+"::lastCols::"+lastCol);
    }

}
