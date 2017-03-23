package jason;

/**
 * Created by suliguo on 2017/3/26.
 */
public class RemoveDuplicatesFromSortedArrayII_80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int len = nums.length;
        for (int i = 1, j = 0; i < nums.length; i++, j++) {
            if (nums[j] != nums[i]) {
                int aa=5;
                nums[j + 1] = nums[i];
                continue;
            }
            len--;
            j--;
        }
        return len;
    }

    public static void main(String[] args) {
        new RemoveDuplicatesFromSortedArrayII_80().removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 2});
    }
}
