package com.rkukuh.codility._02.odd_occurences;

public class Main
{
    public static void main(String[] args)
    {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(odd.solution(A)); // 7
    }
}
