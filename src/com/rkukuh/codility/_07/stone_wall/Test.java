package com.rkukuh.codility._07.stone_wall;

class Test
{
    public static void main(String[] args)
    {
        int[] H = {8, 8, 5, 7, 9, 8, 7, 4, 8};

        StoneWall sw = new StoneWall();

        System.out.println(sw.solution(H)); // 7
    }
}
