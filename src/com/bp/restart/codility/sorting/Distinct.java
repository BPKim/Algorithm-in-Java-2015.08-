package com.bp.restart.codility.sorting;

import java.util.Arrays;

public class Distinct {

    public static void main(String [] args){
        Distinct a = new Distinct();

        System.out.println(a.solution(new int[]{-1,-1,-2,-3,-4,-5,-10,0,10,1,2,3,4,5,6,7,8,9,10}));
    }
    /**
     Write a function

     class Solution { public int solution(int[] A); }

     that, given an array A consisting of N integers, returns the number of distinct values in array A.

     For example, given array A consisting of six elements such that:

     A[0] = 2    A[1] = 1    A[2] = 1
     A[3] = 2    A[4] = 3    A[5] = 1
     the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

     Write an efficient algorithm for the following assumptions:

     N is an integer within the range [0..100,000];
     each element of array A is an integer within the range [−1,000,000..1,000,000].

     */
    public int solution(int[] A) {
        // write your code in Java SE 8

        if(A.length == 0 ){
            return 0;
        }
        Arrays.sort(A);

        int cnt = 1 ;

        for(int i = 1 ; i < A.length ; i++){
            if(A[i-1] != A[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
