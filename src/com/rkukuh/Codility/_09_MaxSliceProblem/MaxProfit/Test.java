package com.rkukuh.Codility._09_MaxSliceProblem.MaxProfit;

class Test
{
    public static void main(String[] args)
    {
        MaxProfit profit = new MaxProfit();

        int[] A = new int[6];

        A[0] = 23171;
        A[1] = 21011;
        A[2] = 21123;
        A[3] = 21366;
        A[4] = 21013;
        A[5] = 21367;

        System.out.println(profit.solution(A)); // 356
    }
}
