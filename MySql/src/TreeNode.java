import java.util.ArrayList;

/**
 * Created by lsr on 2016/11/26.
 */
public class TreeNode {
    public boolean distinct;
    public boolean where;
    public ExTreeNode w_clause;
    public boolean order;
    public String o_clause;
    public ArrayList<String> attributes;

    public TreeNode() {
        this.distinct = false;
        this.where = false;
        this.w_clause = null;
        this.order = false;
        this.o_clause = null;
        this.attributes = new ArrayList<>();
    }
}
