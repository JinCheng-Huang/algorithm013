package edu.geek.study.combinations;

import java.util.ArrayList;
import java.util.List;
/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * 示例:
 * 输入: [1,2,3]
 * 输出:
 * [
 *  [1,2,3],
 *  [1,3,2],
 *  [2,1,3],
 *  [2,3,1],
 *  [3,1,2],
 *  [3,2,1]
 * ]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Permutation {

	public static void main(String[] args) {
		List<List<Integer>> result = permute(new int[]{1,2,3});
		System.out.println(1111);
	}

	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> numList = new ArrayList<Integer>();
        for (int i : nums) {
        	numList.add(i);
		}
        fillPermute(numList, new ArrayList<Integer>(), result);
        return result;
    }

	private static void fillPermute(List<Integer> numList, ArrayList<Integer> list, List<List<Integer>> result) {
		if(numList.size() == 0) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		for (int i = 0; i < numList.size(); i++) {
			list.add(numList.get(i));
			List<Integer> newList = new ArrayList<Integer>(numList);
			newList.remove(i);
			fillPermute(newList, list, result);
			list.remove(list.size() - 1);
		}
	}
	
}
