package com.prep.IQ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Recursion {

    public static void main(String[] args) {
       
        fibonacci();
        recursionFibonacci();
    }

    /**Tawish's implemntation: Need to find BigO for this compared to recusriion 
     * f(n)=f(n-1)+f(n-2)
     */
    public static void fibonacci() {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                map.put(i, 0);
            else if (i == 1)
                map.put(i, 1);
            else {
                Integer j = map.get(i - 1) + map.get(i - 2);
                map.put(i, j);
            }

        }
        for (int k : map.values())
            System.out.println(k);

    }
    
    /**
     * Important Recusrion for Fibonaacci
     */
    
    public static void recursionFibonacci(){
        for(int i=1;i<10;i++){
            System.out.println(recursion(i));
        }
    }
    public static int recursion(int number){
        if(number==1 || number==2) return 1;
        else return recursion(number-1)+ recursion(number-2);
    }
}
     