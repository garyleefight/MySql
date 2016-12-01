import java.util.Stack;

/**
 * Created by lsr on 2016/11/26.
 */
public class ExTreeNode {
    ExTreeNode left;
    ExTreeNode right;
    String op;

    public ExTreeNode() {
        left = null;
        right = null;
        op = null;
    }

    public ExTreeNode(ExTreeNode left, ExTreeNode right, String op) {
        this.left = left;
        this.right = right;
        this.op = op;
    }

    public ExTreeNode(String op) {
        this.op = op;
        left = null;
        right = null;
    }



}
