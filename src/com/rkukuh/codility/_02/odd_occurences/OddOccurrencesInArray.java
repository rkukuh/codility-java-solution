package com.rkukuh.codility._02.odd_occurences;

import java.util.HashMap;

public class OddOccurrencesInArray
{
    public int solution(int[] A)
    {
        HashMap<Integer, Object> map = new HashMap<>();

        for (int a : A) {

            if (map.containsKey(a)) {

                map.remove(a);
            }
            else {

                map.put(a, null);
            }
        }

        return (Integer) map.keySet().toArray()[0];
    }
}
