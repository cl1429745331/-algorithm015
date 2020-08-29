/**
 *
 * 移动零
 * @author cc
 * @version 1.0
 * @date 2020/8/29 20:10
 */
public class No283 {

    public static void main(String[] args) {

    }

    /**
     * 开启游标，将不为0的数移动到数组前面，游标累加，最后将后面的数字改为0。
     * @param nums
     */
    public void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
