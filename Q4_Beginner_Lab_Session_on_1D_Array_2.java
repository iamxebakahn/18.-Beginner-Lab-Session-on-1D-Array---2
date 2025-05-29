/*Problem Description

Given an array A of N integers. 
Count the number of elements that have at least 1 elements greater than itself.


Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109


Input Format

First and only argument is an array of integers A.


Output Format

Return the count of elements.


Example Input

Input 1:
A = [3, 1, 2]
Input 2:
A = [5, 5, 3]


Example Output

Output 1:
2
Output 2:
1


Example Explanation

Explanation 1:
The elements that have at least 1 element greater than itself are 1 and 2
Explanation 2:
The elements that have at least 1 element greater than itself is 3 */

//Method 1

public class Q4_Beginner_Lab_Session_on_1D_Array_2{
    public int solve(ArrayList<Integer> A) {
        int max=A.get(0);
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>max)
                max=A.get(i);
        }

        int count=0;
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)==max)
                count++;
        }

        return A.size()-count;

    }
}


import java.util.ArrayList;


//Method 2
public class Solution {
    public int solve(int[] A) {
        int N=A.length;
        int counter=0;
        //int flag=0;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i!=j)
                {
                    if(A[j]>A[i])
                        {
                            counter++;
                            break;
                        }

                }
            }
        }

        return counter;
    }
}


