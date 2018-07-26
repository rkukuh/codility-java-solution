package com.rkukuh.codilitylessons.cyclicrotation;

public class Main
{
    public static void main(String[] args)
    {
        CyclicRotation cr = new CyclicRotation();

        /* Test #1 */

        int[] A1 = {3, 8, 9, 7, 6};
        int K1 = 3;

        // expect: {9, 7, 6, 3, 8}
        int[] cycledArray1 = cr.solution(A1, K1);

        for (int cycledArray: cycledArray1) {

            System.out.println(cycledArray);
        }

        System.out.println(); // break line

        /* Test #2 */

        int[] A2 = {0, 0, 0};
        int K2 = 3;

        // expect: {0, 0, 0}
        int[] cycledArray2 = cr.solution(A2, K2);

        for (int cycledArray: cycledArray2) {

            System.out.println(cycledArray);
        }

        System.out.println(); // break line

        /* Test #3 */

        int[] A3 = {1, 2, 3, 4};
        int K3 = 4;

        // expect: {1, 2, 3, 4}
        int[] cycledArray3 = cr.solution(A3, K3);

        for (int cycledArray: cycledArray3) {

            System.out.println(cycledArray);
        }
    }
}
