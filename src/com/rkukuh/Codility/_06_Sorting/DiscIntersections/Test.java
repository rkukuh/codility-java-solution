package com.rkukuh.Codility._06_Sorting.DiscIntersections;

class Test
{
    public static void main(String[] args)
    {
        int[] A = {1, 5, 2, 1, 4, 0};

        NumberOfDiscIntersections count = new NumberOfDiscIntersections();

        System.out.println(count.solution(A)); // 11
    }
}
