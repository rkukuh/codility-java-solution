package com.rkukuh.Codility._06.triangle;

class Test
{
    public static void main(String[] args)
    {
        int[] A = {10, 2, 5, 1, 8, 20};
        int[] B = {10, 50, 5, 1};

        Triangle t = new Triangle();

        System.out.println(t.solution(A)); // 1
        System.out.println(t.solution(B)); // 0
    }
}
