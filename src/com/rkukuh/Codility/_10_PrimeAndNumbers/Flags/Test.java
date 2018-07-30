package com.rkukuh.Codility._10_PrimeAndNumbers.Flags;

class Test
{
    public static void main(String[] args)
    {
        Flags f = new Flags();

        int[] A = new int[12];

        A[0] = 1;
        A[1] = 5;
        A[2] = 3;
        A[3] = 4;
        A[4] = 3;
        A[5] = 4;
        A[6] = 1;
        A[7] = 2;
        A[8] = 3;
        A[9] = 4;
        A[10] = 6;
        A[11] = 2;

        System.out.println(f.solution(A)); // 3
    }
}
