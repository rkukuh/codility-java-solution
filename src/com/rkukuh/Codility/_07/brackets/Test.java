package com.rkukuh.Codility._07.brackets;

class Test
{
    public static void main(String[] args)
    {
        String S1 = "{[()()]}";
        String S2 = "([)()]";

        Brackets b = new Brackets();

        System.out.println(b.solution(S1)); // 1
        System.out.println(b.solution(S2)); // 0
    }
}
