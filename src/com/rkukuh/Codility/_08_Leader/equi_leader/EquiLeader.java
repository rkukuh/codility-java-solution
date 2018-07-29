package com.rkukuh.Codility._08_Leader.equi_leader;

public class EquiLeader
{
    public int solution(int[] A)
    {
        int size = 0;
        int value = 0;

        for (int aA : A) {

            if (size == 0) {

                size++;
                value = aA;
            }
            else {

                if (aA == value) size++;
                else size--;
            }
        }


        int count = 0;

        for (int aA : A) {

            if (aA == value) count++;
        }

        if (count <= (A.length/2)) {

            return 0;
        }
        else {

            int indices = 0;
            size = 0;

            for (int k=0; k<A.length-1; k++) {

                if (A[k] == value) {

                    count--;
                    size++;
                }

                if ((size > ((k+1)/2)) && (count > (A.length-(k+1))/2 )) {

                    indices++;
                }
            }

            return indices;
        }
    }
}
