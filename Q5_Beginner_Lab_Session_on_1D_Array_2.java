/*Problem Description

Given a dynamic Array A.
Return a dynamic Array which has All Unique Elements from the given Array.

Note (About Dynamic Array):
For JAVA: ArrayList
For CPP: vector
For Python: List



Problem Constraints

1 <= A.size() <= 1000
-100000 <= A[i] <= 100000


Input Format

Single Argument A is a Dynamic Array of Integer.


Output Format

Return Integer Dynamic Array of all unique numbers.


Example Input

Input 1 :
A : [8, 54, 79, 62, 33, 59, 14, 8, 20, 27, 33, 54]

Input 2 :
A : [31, 38, 36, 45, 48, 47, 44, 26, 31, 45]


Example Output

Output 1 :
[79, 62, 59, 14, 20, 27]
Output 2 :
[38, 36, 48, 47, 44, 26]


Example Explanation

Explanation 1 :
The array is [8 54 79 62 33 59 14 8 20 27 33 54], 
Unique elements in Array are: [79, 62, 59, 14, 20, 27]
Explanation 2 :
The array is [31 38 36 45 48 47 44 26 31 45], 
Unique elements in Array are: [38, 36, 48, 47, 44, 26] */

//Method 1

public class Q5_Beginner_Lab_Session_on_1D_Array_2 {
    public int[] solve(int[] A) {
        int N=A.length;
        int count=0, r=0;
        int[] res=new int[N];
        for(int i=0;i<A.length;i++)
        {
            count=0;
            for(int j=0;j<A.length;j++)
            {
                if(i!=j)
                {
                    if(A[j]==A[i])
                        count++;
                }
            }

            if(count==0)
            {
                res[r]=A[i];
                r++;
            }

        }

        int[] res_arr=new int[r];
        for(int i=0;i<r;i++)
            res_arr[i]=res[i];

        return res_arr;

    }
}

// Method 2
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int count =0;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<A.size();i++)
        {
            count=0;
            for(int j=0;j<A.size();j++)
            {
                if(A.get(i)==A.get(j))
                    count++;
            }

            if(count==1)
                ans.add(A.get(i));
        }

        return ans;
    }
}

