package com.rkukuh.Codility._04.max_counters;

class Test
{
    public static void main(String[] args)
    {
        int[] A = new int[10];

        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;

        MaxCounters mc = new MaxCounters();

        // expect: {3, 2, 2, 4, 2}
        int[] results = mc.solution(5, A);

        for (int result : results) {

            System.out.print(result + " ");
        }
    }
}
