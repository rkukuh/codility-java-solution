package com.rkukuh.codility._03.frog_jump;

class FrogJmp
{
    public int solution(int X, int Y, int D)
    {
        int jumps = (int) Math.ceil((double) (Y - X) / D);

        return jumps;
    }
}
