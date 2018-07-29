package com.rkukuh.Codility._03_TimeComplexity.FrogJump;

public class FrogJmp
{
    public int solution(int X, int Y, int D)
    {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
