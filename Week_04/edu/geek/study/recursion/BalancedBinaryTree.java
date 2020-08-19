package edu.geek.study.recursion;

/**
 *给定一个二叉树，判断它是否是高度平衡的二叉树。
 *本题中，一棵高度平衡二叉树定义为：
 *一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 *示例 1:
 *给定二叉树 [3,9,20,null,null,15,7]
 *	 3
 * 	/ \
 * 9  20
 * 	 /  \
 *  15   7
 *返回 true 。
 *
 *示例 2:
 *给定二叉树 [1,2,2,3,3,null,null,4,4]
 *	   	1
 *	   / \
 *	  2   2
 *	 / \
 * 	3   3
 * / \
 *4   4
 *返回 false 。
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/balanced-binary-tree
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。 
 */
public class BalancedBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3), l1 = new TreeNode(9), r1 = new TreeNode(20), rl2 = new TreeNode(15), rr2 = new TreeNode(7);
		root.left = l1;
		root.right = r1;
		r1.left = rl2;
		r1.right = rr2;
		
		TreeNode _root = new TreeNode(1), _l1 = new TreeNode(2), _r1 = new TreeNode(2), _l1l2 = new TreeNode(3), _l1r2 = new TreeNode(3), _l2l3 = new TreeNode(4), _l2r3 = new TreeNode(4);
		_root.left = _l1;
		_root.right = _r1;
		_l1.left = _l1l2;
		_l1.right = _l1r2;
		_l1l2.left = _l2l3;
		_l1l2.right = _l2r3;
		System.out.println(isBalanced(root));
	}

	// 深度优先遍历：计算左右子树的深度
	// 注意：同时判断子树是否平衡
    public static boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        //return Math.abs(getDepth(root.left)- getDepth(root.right)) <= 1;
        return Math.abs(getDepth(root.left)- getDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int getDepth(TreeNode root) {
        if(root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
    
    static class TreeNode {
    	int val;
    	TreeNode left;
    	TreeNode right;
    	TreeNode(int x) { val = x; }
    }
}
