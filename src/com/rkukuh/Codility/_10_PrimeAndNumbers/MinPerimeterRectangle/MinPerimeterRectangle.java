package com.rkukuh.Codility._10_PrimeAndNumbers.MinPerimeterRectangle;

class MinPerimeterRectangle
{
    public int solution(int N)
    {
        int i = 1;
        int min = 1 + N;

        while (i * i <= N) {
            if (N % i == 0) {
                min = Math.min(min, N / i + i);
            }

            i++;
        }

        return 2 * min;
    }
}
