/**
 * 删除排序数组中的重复项
 *
 * @author cc
 * @version 1.0
 * @date 2020/8/29 19:13
 */
public class No26 {

    public static void main(String[] args) {

    }

    /**
     * 开启一个下标，当前后两数不同时，新开的下标+1，同时将不同的数放在新下标的位置上。
     * 最后返回的是总共多少个不同数。
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
