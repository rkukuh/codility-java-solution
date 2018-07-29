package com.rkukuh.Codility._05_PrefixSums.MinAvgSlice;

class Test
{
    public static void main(String[] args)
    {
        int[] A = new int[10];

        A[0] = 4;
        A[1] = 2;
        A[2] = 2;
        A[3] = 5;
        A[4] = 1;
        A[5] = 5;
        A[6] = 8;

        MinAvgTwoSlice min = new MinAvgTwoSlice();

        System.out.println(min.solution(A)); // 7
    }
}
