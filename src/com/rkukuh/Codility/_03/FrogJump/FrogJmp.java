package com.rkukuh.Codility._03.FrogJump;

public class FrogJmp
{
    public int solution(int X, int Y, int D)
    {
        int jumps = (int) Math.ceil((double) (Y - X) / D);

        return jumps;
    }
}
