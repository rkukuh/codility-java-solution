package com.rkukuh.Codility._10_PrimeAndNumbers.CountFactors;

class CountFactors
{
    public int solution(int N)
    {
        int result = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (i == Math.sqrt(N)) {
                result++;
            } else if (N % i == 0) {
                result = result + 2;
            }
        }

        return result;
    }
}
