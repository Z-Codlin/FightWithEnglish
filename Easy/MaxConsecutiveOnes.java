/*-------------------

      Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:

Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.



Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000


      
        
---------------------------*/
import java.lang.*;
import java.util.*;

public class MaxConsecutiveOnes {
    public static int solution(int[] a) {
        int result = 0;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                temp++;
            } else {
                if (temp >= result) {
                    result = temp;
                }
                temp = 0;
            }
        }
        if (temp > result) {
            result = temp;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1};
        int result = solution(a);
        System.out.printf("----%d",result);
    }

}
