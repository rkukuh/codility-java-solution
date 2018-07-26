package com.rkukuh.codilitylessons.oddoccurences;

public class Main
{
    public static void main(String[] args)
    {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};

        // A[0] = 9  A[1] = 3  A[2] = 9
        // A[3] = 3  A[4] = 9  A[5] = 7
        // A[6] = 9
        //
        // The elements at indexes 0 and 2 have value 9,
        // The elements at indexes 1 and 3 have value 3,
        // The elements at indexes 4 and 6 have value 9,
        // The element at index 5 has value 7 and is unpaired.

        System.out.println(odd.solution(A)); // 7
    }
}
