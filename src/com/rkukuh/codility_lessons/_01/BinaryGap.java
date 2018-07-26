package com.rkukuh.codility_lessons._01;

class BinaryGap
{
    public int solution(int N)
    {
        int longestBinaryGap = 0;
        int currentBinaryGap = -1;

        int val = N;

        while (val != 0) {

            if ((val & 1) == 1) {

                if (longestBinaryGap < currentBinaryGap) {

                    longestBinaryGap = currentBinaryGap;
                }

                currentBinaryGap = 0;

            }
            else if (currentBinaryGap != -1) {

                ++currentBinaryGap;
            }

            val = val >> 1;
        }

        return longestBinaryGap;
    }
}
