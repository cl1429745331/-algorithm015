import java.util.Arrays;

/**
 * 和平两个有序数组
 *
 * @author cc
 * @version 1.0
 * @date 2020/8/29 20:27
 */
public class No88 {

    public static void main(String[] args) {

    }

    /**
     * 因为nums1容量做够，直接将nums2的数据填充到1中，然后调用api进行排序。
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        // System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
