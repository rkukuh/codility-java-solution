package com.rkukuh.Codility._05_PrefixSums.count_div;

public class CountDiv
{
    public int solution(int A, int B, int K)
    {
        int remainderA = A % K;

        if (remainderA != 0) {

            A = A + (K - remainderA);
        }

        if (A > B) {

            return 0;
        }

        return ((B - A) / K) + 1;
    }
}
