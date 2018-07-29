package com.rkukuh.Codility._05.genomic_range;

public class GenomicRangeQuery
{
    public int[] solution(String S, int[] P, int[] Q)
    {
        int N = S.length();
        int[][] count = new int[N + 1][4];

        for (int i = 0; i < N; i++) {

            System.arraycopy(count[i], 0, count[i + 1], 0, 4);

            switch (S.charAt(i)) {

                case 'A':
                    count[i + 1][0]++;
                    break;

                case 'C':
                    count[i + 1][1]++;
                    break;

                case 'G':
                    count[i + 1][2]++;
                    break;

                case 'T':
                    count[i + 1][3]++;
                    break;
            }
        }

        int M = P.length;
        int[] results = new int[M];

        for (int i = 0; i < M; i++) {

            int i0 = P[i];
            int i1 = Q[i];

            for (int j = 0; j < 4; j++) {

                if (count[i1 + 1][j] - count[i0][j] > 0) {

                    results[i] = j + 1;
                    break;
                }
            }
        }

        return results;
    }
}
