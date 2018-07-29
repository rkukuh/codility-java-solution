package com.rkukuh.Codility._05.genomic_range;

class Test
{
    public static void main(String[] args)
    {
        GenomicRangeQuery grq = new GenomicRangeQuery();

        int[] P = new int[3];
        int[] Q = new int[3];

        P[0] = 2;
        P[1] = 5;
        P[2] = 0;

        Q[0] = 4;
        Q[1] = 5;
        Q[2] = 6;

        // expect: {2, 4, 1}
        int[] results = grq.solution("CAGCCTA", P, Q);

        for (int result : results) {

            System.out.print(result + " ");
        }
    }
}
