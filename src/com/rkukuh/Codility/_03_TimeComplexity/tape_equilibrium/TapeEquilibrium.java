package com.rkukuh.Codility._03_TimeComplexity.tape_equilibrium;

public class TapeEquilibrium
{
    public int solution(int[] A) {

        int sumMin = A[0];
        int sumMax = 0;

        for (int i = 1; i < A.length; i++) {

            sumMax += A[i];
        }

        int minDif = Math.abs(sumMin - sumMax);

        for (int i = 1; i < A.length - 1; i++) {

            sumMin += A[i];
            sumMax -= A[i];

            minDif = Math.min(minDif, Math.abs(sumMin - sumMax));
        }

        return minDif;
    }
}
