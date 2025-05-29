/*Problem Description

Given an array A[].
Check if it is in Strictly Decreasing order or not.
If Array is in Strictly Decreasing order, return 1.
Otherwise, return 0.


Problem Constraints

1 <= A.length <= 105


Input Format

Single Argument A, which is an array of Integer.


Output Format

Return 1 if array is Strictly Decreasing, otherwise return 0.


Example Input

Input 1 :
A[] : 100 90 80 70 60 50 40 30 20 10

Input 2 :
A[] : 80 70 60 60 50 40 30 20



Example Output

Output 1 :
1

Output 2 :
0


Example Explanation

Explanation 1 :
Array is [100 90 80 70 60 50 40 30 20 10] and it is in strictly decreasing order.
That's why 1 is the answer.

Explanation 2 :
Array is [80 70 60 60 50 40 30 20] and because of two continuous 60, it is not in strictly decreasing order.
That's why 0 is the answer.
 */

//Method 1
public class Q1AP_Beginner_Lab_Session_on_1D_Array_2 
{
    public int solve(ArrayList<Integer> A) 
    {
        for(int i=0;i<A.size()-1;i++)
        {

            if(A.get(i)<=A.get(i+1))
                return 0;
        }

        return 1;
    }
}


import java.util.ArrayList;

//Method 2

public class Solution {
    public int solve(int[] A) {
        int N=A.length;
        int flag=0;
        for(int i=N-1;i>0;i--)
        {
            if(A[i]<A[i-1])
            {
                flag++;
            } 

        }

        if(flag==N-1)
            return 1;
        else
            return 0;
    }
}


