package com.rkukuh.Codility._07_StackAndQueue.Fish;

import java.util.Stack;

public class Fish
{
    public int solution(int[] A, int[] B)
    {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {

            int size = A[i];
            int direction = B[i];

            if (stack.empty()) {

                stack.push(i);
            }
            else {

                while (!stack.empty() && (direction - B[stack.peek()]) == -1 && A[stack.peek()] < size) {

                    stack.pop();
                }

                if (!stack.empty()) {

                    if ((direction - B[stack.peek()]) != -1) {

                        stack.push(i);
                    }
                }
                else {

                    stack.push(i);
                }
            }
        }

        return stack.size();
    }
}
