package com.rkukuh.Codility._05_PrefixSums.PassingCars;

class Test
{
    public static void main(String[] args)
    {
        int[] A = new int[5];

        A[0] = 0;
        A[1] = 1;
        A[2] = 0;
        A[3] = 1;
        A[4] = 1;

        PassingCars pc = new PassingCars();

        System.out.println(pc.solution(A)); // 5
    }
}
