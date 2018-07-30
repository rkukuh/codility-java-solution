package com.rkukuh.Codility.JobTest.Tokopedia.Task03;

class Test
{
    public static void main(String[] args)
    {
        Task3 t = new Task3();

        int[] A = {1, 2, 3};
        int[] B = {1, 1, 6};
        int[] C = {1, 6, 2, 3};

        System.out.println(t.solution(A)); // 2
        System.out.println(t.solution(B)); // 2
        System.out.println(t.solution(C)); // 3
    }
}
