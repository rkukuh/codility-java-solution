package com.rkukuh.codility._02.cyclic_rotation;

public class CyclicRotation
{
    public int[] solution(int[] A, int K) {

        int size = A.length - 1;

        if (size <= 0) {

            return A;
        }

        for (int count = 1; count <= K; count++) {

            int lastValue = A[size];

            for (int i = 0; i <= size - 1; i++) {

                A[size - i] = A[size - (i + 1)];
            }

            A[0] = lastValue;
        }

        return A;
    }
}
