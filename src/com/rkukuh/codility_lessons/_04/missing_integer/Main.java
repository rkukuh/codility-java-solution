package com.rkukuh.codility_lessons._04.missing_integer;

import com.rkukuh.codility_lessons._03.missing_element.PermMissingElem;

public class Main
{
    public static void main(String[] args)
    {
        // Use the exact solution from Lesson 03
        PermMissingElem missing = new PermMissingElem();

        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -3};

        System.out.println(missing.solution(A)); // 5
        System.out.println(missing.solution(B)); // 4
        System.out.println(missing.solution(C)); // 1
    }
}
