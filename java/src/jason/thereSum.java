package jason;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by suliguo on 2017/5/14.
 */
public class thereSum {
    public List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length < 3) return result;
        List t = Arrays.asList(nums);
        t.sort((o1, o2) -> (Integer) o1 > (Integer)o2 ? 1 : -1);
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1, k = nums.length - 1;
             while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    j++;
                    k--;
                    while (j < k && nums[j - 1]==nums[j]) j++;
                    while (j < k && nums[k]==nums[k + 1]) k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
            while (i < nums.length - 1 && nums[i]==nums[i + 1]) i++;
        }
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> result = new thereSum().solution(new int[]{-1,0,1,2,-1,-4});
        result.forEach(ints -> {
            for (Integer s : ints) {
                System.out.print(s + "\t");
            }
            System.out.println();
        });
    }

}
