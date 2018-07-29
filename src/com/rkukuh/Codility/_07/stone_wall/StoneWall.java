package com.rkukuh.Codility._07.stone_wall;

import java.util.Stack;

public class StoneWall
{
    public int solution(int[] H)
    {
        Stack<Integer> st = new Stack<>();

        int numBlock = 0;

        for (int aH : H) {

            while (!st.isEmpty() && st.peek() > aH) {

                st.pop();
            }

            if (st.isEmpty()) {

                numBlock++;

                st.push(aH);
            }
            else if (st.peek() == aH) {

                //
            }
            else if (st.peek() < aH) {

                numBlock++;

                st.push(aH);
            }
        }

        return numBlock;
    }
}
