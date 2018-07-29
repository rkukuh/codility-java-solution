package com.rkukuh.Codility._08.dominator;

import java.util.HashMap;

public class Dominator
{
    public int solution(int[] A)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        if (A.length == 1) {

            return 0;
        }

        for (int i = 0; i < A.length; i++) {

            if (map.containsKey(A[i])) {

                if (map.get(A[i]) >= A.length / 2) {

                    return i;
                }
                else {

                    map.put(A[i], map.get(A[i]) + 1);
                }
            }
            else {

                map.put(A[i], 1);
            }
        }

        return -1;
    }
}
