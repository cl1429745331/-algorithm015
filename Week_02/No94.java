import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * @author cc
 * @version 1.0
 * @date 2020/9/6 20:53
 */
public class No94 {

    public static void main(String[] args) {

    }


    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    public void helper(TreeNode treeNode, List list) {
        if (treeNode != null) {
            if (treeNode.left != null) {
                helper(treeNode.left, list);
            }
            list.add(treeNode.val);
            if (treeNode.right != null) {
                helper(treeNode.right, list);
            }
        }
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            this.val = x;
        }
    }
}
