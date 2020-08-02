package edu.geek.study.array;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 
 * 说明:
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 * 
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int k = 3;
		rotate1(a, k);
		for (int i : a) {
			System.out.println(i);
		}
	}
	// 方法1:取数组最后一个元素，然后数组整体后移，重复k次, 时间O(k*n)
	public static void rotate1(int[] nums, int k) {
		if (nums != null && nums.length > 0) {
			for (; k > 0; k--) {
				int tmp = nums[nums.length - 1];
				move(nums, 0, nums.length - 2);
				nums[0] = tmp;
			}
		}
    }
	private static void move(int[] nums, int start, int end) {
		for (; start <= end; end--) {
			nums[end + 1] = nums[end];
		}
	}
	// 方法2:环状替换 TODO
	
	// 方法3:使用反转，整体反转，然后前K个数反转，最后n-k个数反转
	public static void rotate3(int[] nums, int k) {
		
    }
}
