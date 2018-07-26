package com.rkukuh.codility._06.disc_intersection;

import java.util.Arrays;

public class NumberOfDiscIntersections
{
    public int solution(int[] A)
    {
        // Main idea:
        // 1. Store all the "lower points" and "upper points" of the discs
        // 2. Count the intersections (if one upper point > one lower point)

        long[] lower = new long[A.length];
        long[] upper = new long[A.length];

        for (int i = 0; i < A.length; i++) {

            lower[i] = i - (long)A[i]; // note: lower = center - A[i]
            upper[i] = i + (long)A[i]; // note: upper = center + A[i]
        }

        Arrays.sort(upper);
        Arrays.sort(lower);

        int j = 0; // for the lower points
        int intersection = 0; // number of intersections

        for (int i = 0; i < A.length; i++) {

            while (j < A.length && upper[i] >= lower[j]) {

                intersection = intersection + j; // add j intersections
                intersection = intersection - i; // minus "i" (avoid double count)

                j++;
            }
        }

        if (intersection > 10_000_000) {

            return -1;
        }

        return intersection;
    }
}
