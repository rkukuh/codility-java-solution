package com.rkukuh.codility_lessons._04.permutation_check;

public class Main
{
    public static void main(String[] args)
    {
        int[] A = {4, 1, 3, 2};
        int[] B = {4, 1, 3};

        PermCheck pc = new PermCheck();

        System.out.println(pc.solution(A)); // 1
        System.out.println(pc.solution(B)); // 0
    }
}
