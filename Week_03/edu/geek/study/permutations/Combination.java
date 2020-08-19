package edu.geek.study.permutations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 *示例:
 *输入: n = 4, k = 2
 *输出:
 *[
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/combinations
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Combination {

	public static void main(String[] args) {
		List<List<Integer>> result = combine(5,3);
		for (List<Integer> list : result) {
			System.out.println(String.join(",", list.toArray(new String[1])));
		}
	}
	// n = 5 [1~5] k = 3
	// 1,2,3,4,5
	// 先固定第一个数，k--,然后在其他数中固定第二数，k--,k=0跳出
	// 每次k--后，n的数组长度减一，遍历数组，数组遍历完则结束
	public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        fillCombine(n, 1, k, 1, new LinkedList<>(), result);
        return result;
    }
	
	public static void fillCombine(int max_num, int current_num, int max_k, int current_k, LinkedList<Integer> current_list, List<List<Integer>> result) {
		// 终止
		if(current_k > max_k) {
			result.add(new ArrayList<Integer>(current_list));
			return;
		}
		// 处理
		for (int i = current_num; i <= max_num; i++) {
			current_list.add(i);
			// 下钻
			fillCombine(max_num, i + 1, max_k, current_k + 1, current_list, result);
			// 清除状态
			current_list.removeLast();
		}
	}
}
