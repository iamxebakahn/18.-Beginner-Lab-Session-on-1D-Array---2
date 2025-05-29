/*Problem Description

Given an array A, check if it is sorted in non-decreasing order or not.

Non-decreasing order means that the numbers in a sequence can stay the same or increase, but they cannot decrease.


Problem Constraints

1 <= Ai <= 109
1 <= |A| <= 105


Input Format

The first and only argument contains an integer array A.


Output Format

Return 1 if array is sorted else return 0.


Example Input

Input 1:
 A = [1, 2, 2] 
Input 2:
 A = [1, 2, 1] 


Example Output

Output 1:
 1
Output 2:
 0


Example Explanation

Explanation 1:
We can see that the array elements are in non-decreasing order.
Explanation 2:
Second element is greater than the third element thus array is not in ascending order, hence not sorted. */

//Method 1

public class Q3_Beginner_Lab_Session_on_1D_Array_2{
    public int solve(int[] A) {
        int N=A.length;
        int flag=0;
        for(int i=0;i<N-1;i++)
        {
            if(A[i]<=A[i+1])
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

//Method 2
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int N=A.size();
        //int flag=0;
        for(int i=0;i<N-1;i++)
        {
            if(A.get(i)>A.get(i+1))
            {
                return 0;
            } 

        }

        return 1;

    }
}

