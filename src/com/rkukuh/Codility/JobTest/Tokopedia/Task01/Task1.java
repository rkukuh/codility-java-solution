package com.rkukuh.Codility.JobTest.Tokopedia.Task01;

class Task1
{
    public int solution(int A, int B)
    {
        int product = A * B;

        int count = 0;

        while (product != 0) {

            if ((product & 1) == 1) {

                count += 1;

            }

            product = product >> 1;
        }

        return count;
    }
}
