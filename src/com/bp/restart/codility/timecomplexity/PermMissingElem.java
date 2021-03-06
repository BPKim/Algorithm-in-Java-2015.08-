package com.bp.restart.codility.timecomplexity;

import java.security.AllPermission;
import java.util.Arrays;

public class PermMissingElem {

    /**
     * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
     *
     * Your goal is to find that missing element.
     *
     * Write a function:
     *
     * class MinAbsSum { public int solution(int[] A); }
     *
     * that, given an array A, returns the value of the missing element.
     *
     * For example, given array A such that:
     *
     *   A[0] = 2
     *   A[1] = 3
     *   A[2] = 1
     *   A[3] = 5
     * the function should return 4, as it is the missing element.
     *
     * Write an efficient algorithm for the following assumptions:
     *
     * N is an integer within the range [0..100,000];
     * the elements of A are all distinct;
     * each element of array A is an integer within the range [1..(N + 1)].
     */

    public static void main(String [] args){
        PermMissingElem a = new PermMissingElem();

        System.out.println(a.solution(new int[]{1,3}));
    }

    public int solution(int[] A) {

        // write your code in Java SE 8

        Arrays.sort(A);


        for(int i = 0 ; i < A.length ; i ++){
            if(i+1 !=A[i]){
                return i+1;
            }
        }
        return A.length +1 ;
    }


    public int solution2(int[] A) {
        // write your code in Java SE 8

        int result = A.length+1;
        Arrays.sort(A);

        for(int i = 0 ; i < A.length ; i++){
            if(i+1 != A[i]){
                result = i+1;
                break;
            }
        }

        return result;
    }
}
