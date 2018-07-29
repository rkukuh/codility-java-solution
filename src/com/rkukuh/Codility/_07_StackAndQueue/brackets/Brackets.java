package com.rkukuh.Codility._07_StackAndQueue.brackets;

import java.util.Stack;

public class Brackets
{
    public int solution(String S)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {

            switch (S.charAt(i)) {

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return 0;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return 0;
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return 0;
                    break;

                default:
                    stack.push(S.charAt(i));
                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
