/**
 * 
 */
package com.kiran.general.leetcode.easy;

/**
 * @author Kiran
 *
 */
public class BT {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		BT bt = new BT();
		TreeNode root = bt.new TreeNode(1);
		root.left = bt.new TreeNode(2);
		root.left.left = null;
		root.left.right = null;
		root.right = bt.new TreeNode(3);
		root.right.left = bt.new TreeNode(4);
		root.right.left.left = null;
		root.right.left.right = null;
		root.right.right = bt.new TreeNode(5);
		root.right.right.left = null;
		root.right.right.right = null;
		String serializedTree = bt.serialize(root);
		System.out.println("Serialized Tree: " + serializedTree);
		System.out.println("Serialized Tree of deserialize tree: " + bt.serialize(bt.deserialize(serializedTree)));
	}
	
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serializedTree = new StringBuilder();
        if(root != null) {
        	serializedTree.append(root.val).append(",").append(serialize(root.left)).append(",").append(serialize(root.right));
        } else
        	serializedTree.append("null");
        return serializedTree.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
    	TreeNode root = getRoot(data.split(","), 0);
        return root;
    }
    
    public TreeNode getRoot(String[] nodes, int index) {
    	BT bt = new BT();
    }

}
