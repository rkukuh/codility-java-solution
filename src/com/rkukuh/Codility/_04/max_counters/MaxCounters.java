package com.rkukuh.Codility._04.max_counters;

public class MaxCounters
{
    public int[] solution(int N, int[] A)
    {
        int[] result = new int[N];

        int maxCounter = 0;
        int lastUpdate = 0;

        for (int a : A) {

            if (a >= 1 && a <= N) {

                result[a - 1] = Math.max(lastUpdate, result[a - 1]) + 1;
                maxCounter = Math.max(maxCounter, result[a - 1]);
            }
            else if (a == N + 1) {

                lastUpdate = maxCounter;
            }
        }

        for (int j = 0; j < result.length; j++) {

            result[j] = Math.max(result[j], lastUpdate);
        }

        return result;
    }
}
