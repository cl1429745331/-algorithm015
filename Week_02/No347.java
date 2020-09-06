import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 *
 * @author cc
 * @version 1.0
 * @date 2020/9/6 19:35
 */
public class No347 {

    public static void main(String[] args) {
        No347 no347 = new No347();
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> map.get(v1) - map.get(v2));
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int x : map.keySet()) {
            if (queue.size() < k) {
                queue.offer(x);
            } else {
                if (map.get(x) > map.get(queue.peek())) {
                    queue.poll();
                    queue.offer(x);
                }
            }
        }

        int[] result = new int[k];
        int index = 0;
        while (!queue.isEmpty()) {
            result[index++] = queue.poll();
        }

        return result;
    }


}
