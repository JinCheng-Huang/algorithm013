package edu.geek.study.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;


/**
 * 给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
 * 示例 1:
 * 输入: nums = [1,1,1,2,2,3], k = 2
 * 输出: [1,2]
 * 示例 2:
 * 输入: nums = [1], k = 1
 * 输出: [1]
 * 提示：
 * 	你可以假设给定的 k 总是合理的，且 1 ≤ k ≤ 数组中不相同的元素的个数。
 *  你的算法的时间复杂度必须优于 O(n log n) , n 是数组的大小。
 *  题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的。
 *  你可以按任意顺序返回答案。
 *  
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/top-k-frequent-elements
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TopKFrequentElements {

	public static void main(String[] args) {

	}

	// 利用最大堆
	public Integer[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		for (int i : nums) {
			mapping.put(i, mapping.getOrDefault(i, 0) + 1);
		}
		PriorityQueue<Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue()-a.getValue()));
		for (Entry<Integer, Integer> entry : mapping.entrySet()) {
			maxHeap.add(entry);
		}
		List<Integer> list = new ArrayList<Integer>();
		while(list.size() < k) {
			list.add(maxHeap.poll().getKey());
		}
		return list.toArray(new Integer[1]);
    }
}
