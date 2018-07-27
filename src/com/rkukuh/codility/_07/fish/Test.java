package com.rkukuh.codility._07.fish;

class Test
{
    public static void main(String[] args)
    {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};

        Fish f = new Fish();

        System.out.println(f.solution(A, B)); // 2
    }
}
