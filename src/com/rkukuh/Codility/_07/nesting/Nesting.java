package com.rkukuh.Codility._07.nesting;

import java.util.Stack;

public class Nesting
{
    public int solution(String S)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {

            switch (S.charAt(i)) {

                case '(':

                    stack.push(S.charAt(i));
                    break;

                case ')':

                    if (stack.isEmpty() || stack.peek() != '(') return 0;
                    else stack.pop();

                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
