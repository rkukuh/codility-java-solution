package com.rkukuh.Codility._09_MaxSliceProblem.MaxProfit;

class MaxProfit
{
    public int solution(int[] A)
    {
        if (A.length < 2) return 0;

        int buy     = A[0];
        int profit  = 0;

        for (int i = 1; i < A.length; ++i) {
            final int value = A[i];

            buy     = Math.min(buy, value);
            profit  = Math.max(profit, value - buy);
        }

        return profit;
    }
}
