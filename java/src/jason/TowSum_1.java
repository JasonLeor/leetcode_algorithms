package jason;

import java.util.Arrays;

/**
 * Created by suliguo on 2017/3/23.
 */
//problems:

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

//You may assume that each input would have exactly one solution, and you may not use the same element twice.
public class TowSum_1 {
    public static int[] TowSum(int[] nums , int target){
        int[] solution =new int[0];
        for (int index = 0; index < nums.length; index++) {
            for (int index2 =index+1; index2 < nums.length; index2++) {
                if (nums[index]+nums[index2]==target)
                    return new int[]{index, index2};
            }
        }
        return solution;
    }
    public static void main(String[] args) {
        int[] num = new  int[]{-1,-2,-3,-4,-5};
        int target = -9;
        int[] solution = TowSum(num,target);
        System.out.println(Arrays.toString(solution));
    }
}
