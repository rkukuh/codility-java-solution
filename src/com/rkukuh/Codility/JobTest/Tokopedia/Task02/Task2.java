package com.rkukuh.Codility.JobTest.Tokopedia.Task02;

import java.util.Arrays;

class Task2
{
    public int solution(int[] A)
    {
        Arrays.sort(A);

        for(int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();

        return A[1] - A[0];
    }
}
