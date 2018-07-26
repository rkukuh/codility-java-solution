package com.rkukuh.codility._06.max_product;

import java.util.Arrays;

public class MaxProductOfThree
{
    public int solution(int[] A)
    {
        Arrays.sort(A);

        int maxPossible1 = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        int maxPossible2 = A[0] * A[1] * A[A.length - 1];

        return Math.max(maxPossible1, maxPossible2);
    }
}
