package com.rkukuh.Codility._10_PrimeAndNumbers.Flags;

import java.util.ArrayList;

class Flags
{
    public int solution(int[] A)
    {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                array.add(i);
            }
        }
        if (array.size() == 1 || array.size() == 0) {
            return array.size();
        }

        int flag    = 1;
        int result  = 1;

        while (flag <= array.size()) {
            int used = 0;
            int mark = array.get(0);
            boolean success = false;

            for (Integer anArray : array) {
                if (anArray >= mark) {
                    used++;
                    mark = anArray + flag;

                    if (used == flag) {
                        success = true;
                        break;
                    }
                }
            }

            if (success) {
                result = flag;
                flag++;
            } else {
                break;
            }
        }

        return result;
    }
}
