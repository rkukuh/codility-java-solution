package com.rkukuh.codility._06.max_product;

public class Test
{
    public static void main(String[] args)
    {
        MaxProductOfThree max = new MaxProductOfThree();

        int[] A = {-3, 1, 2, -2, 5, 6};
        int[] B = {-5, 5, -5, 4};

        System.out.println(max.solution(A)); // 60
        System.out.println(max.solution(B)); // 125
    }
}
