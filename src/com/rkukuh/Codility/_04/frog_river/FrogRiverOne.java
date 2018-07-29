package com.rkukuh.Codility._04.frog_river;

public class FrogRiverOne
{
    public int solution(int X, int[] A)
    {
        boolean[] landed = new boolean[X];

        for (int i = 0; i < X; i++) {

            landed[i] = false;
        }

        for (int i = 0; i < A.length; i++) {

            if (!landed[A[i] - 1]) {

                landed[A[i] - 1] = true;

                if (--X == 0) {

                    return i;
                }
            }
        }

        return -1;
    }
}
