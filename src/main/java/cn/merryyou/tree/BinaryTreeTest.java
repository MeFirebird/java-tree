package cn.merryyou.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created on 2018/4/16.
 *
 * @author zlf
 * @since 1.0
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
//       testCreate();
//       testInsert();
//       testQueue();
//       preOrder(init()); // 1 2 3 4 5 6 7
//       inOrder(init()); //  3 2 4 1 6 5 7
//       postOrder(init());  // 3 4 2 6 7 5 1
//       bfsOrder(init()); //1 2 5 3 4 6 7
//       searchTree();
//       findTreeNode();
//        indMinValueTest();
        removeNodeTest();
    }

    /**
     * 构建树
     */
    public static void testCreate() {
        BinaryTree node = new BinaryTree("a");

        System.out.println("【node data】:" + node.getData());
        System.out.println("【node left data】:" + node.left.getData());
        System.out.println("【node right data】:" + node.right.getData());
    }

    /**
     * 测试插入节点
     */
    public static void testInsert() {
        BinaryTree node_a = new BinaryTree("a");
        node_a.insertLeft(node_a, "b");
        node_a.insertRight(node_a, "c");

        BinaryTree node_b = node_a.left;
        node_b.insertRight(node_b, "d");

        BinaryTree node_c = node_a.right;
        node_c.insertLeft(node_c, "e");
        node_c.insertRight(node_c, "f");

        BinaryTree node_d = node_b.right;
        BinaryTree node_e = node_c.left;
        BinaryTree node_f = node_c.right;

        System.out.println("【node_a data】:" + node_a.getData());
        System.out.println("【node_b data】:" + node_b.getData());
        System.out.println("【node_c data】:" + node_c.getData());
        System.out.println("【node_d data】:" + node_d.getData());
        System.out.println("【node_e data】:" + node_e.getData());
        System.out.println("【node_f data】:" + node_f.getData());
    }

    public static void testQueue() {
        Queue<String> queue = new ArrayDeque<String>();
        queue.add("1");
        queue.add("2");
        queue.add("3");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

    /**
     * 构造树
     *
     * @return
     */
    public static BinaryTree init() {
        BinaryTree node_1 = new BinaryTree("1");
        node_1.insertLeft(node_1, "2");
        node_1.insertRight(node_1, "5");

        BinaryTree node_2 = node_1.left;
        BinaryTree node_5 = node_1.right;

        node_2.insertLeft(node_2, "3");
        node_2.insertRight(node_2, "4");

        node_5.insertLeft(node_5, "6");
        node_5.insertRight(node_5, "7");

        return node_1;
    }

    /**
     * 插入树
     */
    public static BinaryTree searchTree() {
        Integer[] intArr = new Integer[]{50, 76, 21, 4, 32, 100, 64, 52};
        BinaryTree node = new BinaryTree(String.valueOf(50));
        for (int i = 1; i < intArr.length; i++) {
            node.insertNode(node, intArr[i]);
        }

        return node;
    }

    /**
     * 查找是否存在该节点
     */
    public static void findTreeNode() {
        BinaryTree node = searchTree();
        System.out.println(node.findNode(node, 52));
    }

    /**
     * 查找最小节点
     */
    public static void findMinValueTest() {
        BinaryTree node = searchTree();
        System.out.println(node.findMinValue(node));
    }

    /**
     * 删除节点
     */
    public static void removeNodeTest() {
        Integer[] intArr = new Integer[]{50, 30, 70, 20, 40};
        BinaryTree node = new BinaryTree(String.valueOf(50));
        for (int i = 1; i < intArr.length; i++) {
            node.insertNode(node, intArr[i]);
        }
//        System.out.println(node.removeNode(node, 20, null));
//        System.out.println(node.removeNode(node, 20, null));
        System.out.println(node.removeNode(node, 30, null));

        System.out.println("..........");
    }
}
