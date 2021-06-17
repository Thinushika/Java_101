/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication94;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication94 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = n;
        
        for (int i=0; i<n; i++){
            for (int j=1; j<=i*4; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=count; j++){
                System.out.print(j+" ");
            }
            for (int j = count-1; j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            count--;
        }   
       /* int rows,coef =1;
        rows = new Scanner(System.in).nextInt();
        for (int i=0; i<rows;i++){
            for (int space =0; space<rows-i; space++){
                System.out.print("");
                for(int j=0;j<=i;j++){
                    if(j==0||i==0){
                        coef=1;
                    }
                    else{
                        coef=coef*(i-j+1)/j;
                    }
                    System.out.println();
                }
            }*/
        }
    }
    
    
    
}
