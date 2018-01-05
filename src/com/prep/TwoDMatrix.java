package com.prep;

import com.sun.javafx.geom.Matrix3f;

/**
 * two D matrix traversal
 * @author tnaqvi
 * @date Dec 22, 2017
 */
public class TwoDMatrix {

    
    public static int [][] matrix= {{13, 23, 45, 67, 56},
                                    {43, 65, 76, 89, 90},
                                    {43, 45, 76, 98, 90},
                                    {34, 56, 76, 43, 87}};
    
    public static void main(String[] args){
        //row traversal
        for(int i=0;i<matrix[i].length;i++){
            //column traversal
            for(int j=0;j<matrix.length;j++){
                System.out.print("i is "+i+"\t"+"j is"+j);
                System.out.println("\t matrix is "+matrix[i][j]);
            }
        }
    }
}
