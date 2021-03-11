package com.cg.lb;

public class GFG {
	static int sum(int N, int X, int Y) 
    { 
        int S1, S2, S3; 
      
        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2; 
        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2; 
        S3 = ((N / (X * Y))) * (2 * (X * Y)                                    
                          + (N / (X * Y) - 1) * (X * Y))/ 2; 
      
        return S1 + S2 - S3; 
    } 
      
        public static void main(String []args) 
    { 
        int N = 19; 
        int X = 3, Y = 6; 
      
        System.out.println(sum(N, X, Y)); 
      
    }  

}
