package com.rkukuh.Codility._04_CountingElements.FrogRiver;

class Test
{
    public static void main(String[] args)
    {
        int[] A = new int[10];

        A[0] = 1;
        A[1] = 3;
        A[2] = 1;
        A[3] = 4;
        A[4] = 2;
        A[5] = 3;
        A[6] = 5;
        A[7] = 4;

        FrogRiverOne frog = new FrogRiverOne();

        System.out.println(frog.solution(5, A)); // 6
    }
}
