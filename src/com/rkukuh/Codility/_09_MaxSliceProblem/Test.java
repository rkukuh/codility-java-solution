package com.rkukuh.Codility._09_MaxSliceProblem;

class Test
{
    public static void main(String[] args)
    {
        MaxDoubleSliceSum max = new MaxDoubleSliceSum();

        int[] A = {3, 2, 6, -1, 4, 5, -1, 2};

        System.out.print(max.solution(A)); // 17
    }
}
