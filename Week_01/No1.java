import java.util.HashMap;

/**
 * 两数之和
 *
 * @author cc
 * @version 1.0
 * @date 2020/8/29 20:17
 */
public class No1 {

    public static void main(String[] args) {

    }

    /**
     * 通过hashmap的键值关系来储存值和他的索引。
     * 如果map中有int temp = target - nums[i];则直接返回相应的数组。
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                return new int[]{hashMap.get(nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
