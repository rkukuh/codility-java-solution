package com.rkukuh.codility_lessons._03.missing_element;

public class PermMissingElem
{
    public int solution(int[] A) {

        int N = A.length + 1;

        int missing = ((N + 1) * N) / 2;

        for (int x : A) {

            missing -= x;
        }

        return missing;
    }
}
