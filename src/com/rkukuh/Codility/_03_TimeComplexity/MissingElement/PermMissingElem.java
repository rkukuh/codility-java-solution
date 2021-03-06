package com.rkukuh.Codility._03_TimeComplexity.MissingElement;

import java.util.HashSet;

public class PermMissingElem
{
    @SuppressWarnings("DanglingJavadoc")
    public int solution(int[] A)
    {
        /** Solution #2: PERFORMANCE */

        int missing = 1;

        HashSet<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }

        while (set.contains(missing)) {
            missing++;
        }

        return missing;


        /** Solution #1: SIMPLE */

        /*int N = A.length + 1;

        int missing = ((N + 1) * N) / 2;

        for (int x : A) {
            missing -= x;
        }

        return missing;*/
    }
}
