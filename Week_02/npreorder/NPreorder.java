package week02.day14.npreorder;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 *
 *
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 */
public class NPreorder {
// Definition for a Node.
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


    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();

        if (root == null){
            return output;
        }

        //根节点入栈
        stack.add(root);
        while (!stack.isEmpty()){
            //每次我们从栈顶取出一个节点 node，它是我们当前遍历到的节点
            Node node = stack.pollLast();
            output.add(node.val);

            //把 node 的所有子节点逆序推入栈中
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }

}
