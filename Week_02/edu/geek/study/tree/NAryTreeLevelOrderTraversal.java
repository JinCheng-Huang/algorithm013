package edu.geek.study.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 *
 */
public class NAryTreeLevelOrderTraversal {

	public static void main(String[] args) {

	}

	// 方法1.利用队列的层序遍历
	public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> targetList = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if(root != null) {
        	queue.add(root);
        	while(!queue.isEmpty()) {
        		List<Integer> list = new ArrayList<Integer>();
        		int size = queue.size();
        		for (int i = 0; i < size; i++) {
        			Node nextNode = queue.poll();
        			list.add(nextNode.val);
        			queue.addAll(nextNode.children);
				}
        		targetList.add(list);
        	}
        }
        return targetList;
    }
	
	class Node {
	    public int val;
	    public List<Node> children;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, List<Node> _children) {
	        val = _val;
	        children = _children;
	    }
	};
}
