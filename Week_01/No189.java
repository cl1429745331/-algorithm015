/**
 * 旋转数组
 *
 * @author cc
 * @version 1.0
 * @date 2020/8/29 19:23
 */
public class No189 {

    public static void main(String[] args) {

    }

    /**
     * 新开一个数组
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
            int[] a = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                a[(i + k) % nums.length] = nums[i];
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = a[i];
            }
    }

    /**
     * 暴力破解
     * @param nums
     * @param k
     */
    /*public void rotate(int[] nums, int k) {
        int temp, pre;
        for (int i = 0; i < k; i++) {
            pre = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = pre;
                pre = temp;
            }
        }
    }*/
}
