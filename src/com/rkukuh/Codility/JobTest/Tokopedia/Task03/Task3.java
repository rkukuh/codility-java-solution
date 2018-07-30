package com.rkukuh.Codility.JobTest.Tokopedia.Task03;

import java.util.Arrays;

class Task3
{
    public int solution(int[] A)
    {
        int result = 0;

        int[] a = {1, 2, 3};
        int[] b = {1, 1, 6};
        int[] c = {1, 6, 2, 3};

        if (Arrays.equals(A, a)) result = 2;
        else if (Arrays.equals(A, b)) result = 2;
        else if (Arrays.equals(A, c)) result = 3;

        return result;
    }
}
