package edu.geek.study.tree;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// 递归+分治：规则：依据前序，先确定根元素，在依据中序，先确定左子树元素和有子树的元素
	// 前序第一个元素是根，中序第一个元素是最左叶子节点
	// 前序：[3,9,8,7,5,4,2,1]
	// 中序：[8,9,7,3,4,5,2,1]
	//	     3
	//   /   \
	//  9     5
	// / \   / \
	//8   7 4   2
	//	         /
	//	        1
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		// TODO
		return null;
    }
	
	class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
}
