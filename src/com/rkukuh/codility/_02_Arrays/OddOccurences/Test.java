package com.rkukuh.codility._02_Arrays.OddOccurences;

class Test
{
    public static void main(String[] args)
    {
        OddOccurrencesInArray odd = new OddOccurrencesInArray();

        int[] A = {9, 3, 9, 3, 9, 7, 9};

        System.out.println(odd.solution(A)); // 7
    }
}
