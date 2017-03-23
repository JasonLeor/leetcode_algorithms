package jason;

/**
 * Created by suliguo on 2017/3/26.
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int len = nums.length;
        for (int i = 1,j=0; i < nums.length; i++,j++) {
           if (nums[j]!=nums[i]){
               nums[j+1]=nums[i];
               continue;
           }
            len--;
            j--;
        }
        return len;
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArray_26().removeDuplicates(new int[]{1,1, 2});
    }
}
