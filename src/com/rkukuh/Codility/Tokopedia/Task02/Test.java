package com.rkukuh.Codility.Tokopedia.Task02;

class Test
{
    public static void main(String[] args)
    {
        Task2 t = new Task2();

        int[] A = {8, 24, 3, 20, 1, 17};
        int[] B = {7, 21, 3, 42, 3, 7};

        System.out.println(t.solution(A)); // 2
        System.out.println(t.solution(B)); // 0
    }
}
