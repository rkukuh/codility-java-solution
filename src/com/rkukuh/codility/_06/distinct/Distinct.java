package com.rkukuh.codility._06.distinct;

import java.util.HashSet;

public class Distinct
{
    public int solution(int[] A)
    {
        HashSet<Integer> set = new HashSet<>();

        for (int a : A) {

            set.add(a);
        }

        return set.size();
    }
}
