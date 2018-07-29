package com.rkukuh.Codility._05.passing_cars;

public class PassingCars
{
    public int solution(int[] A)
    {
        int count = 0;
        int pairs = 0;

        for (int i = (A.length - 1); i >= 0; i--) {

            if (A[i] == 1) {

                pairs++;
            }
            else {

                count += pairs;
            }

            if (count > 1000000000) {

                return -1;
            }

        }

        return count;
    }
}
