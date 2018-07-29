package com.rkukuh.Codility._07_StackAndQueue.Nesting;

class Test
{
    public static void main(String[] args)
    {
        String S1 = "(()(())())";
        String S2 = "())";

        Nesting n = new Nesting();

        System.out.println(n.solution(S1)); // 1
        System.out.println(n.solution(S2)); // 0
    }
}
