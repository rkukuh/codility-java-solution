package com.rkukuh.Codility._10_PrimeAndNumbers.Peaks;

import java.util.ArrayList;

class Peaks
{
    public int solution(int[] A)
    {
        int N = A.length;

        ArrayList<Integer> peaks = new ArrayList<>();

        for (int i = 1; i < N - 1; i++) {
            if (A[i] > A[i - 1] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }

        for (int size = 1; size <= N; size++) {
            if (N % size != 0) continue;

            int find    = 0;
            int groups  = N/size;

            boolean ok = true;

            for (int peak : peaks) {
                if (peak / size > find) {
                    ok = false;
                    break;
                }

                if (peak / size == find) find++;
            }

            if (find != groups) ok = false;
            if (ok) return groups;
        }

        return 0;
    }
}
