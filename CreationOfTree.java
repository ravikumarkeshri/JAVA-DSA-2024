import java.util.ArrayList;

public class CreationOfTree {
    public static class TreeNode {
        String data;
        ArrayList<TreeNode> children;

        TreeNode(String data) {
            this.data = data;
            this.children = new ArrayList<TreeNode>();
        }

        public void addChild(TreeNode node) {
            this.children.add(node);
        }

        public String print(int level) {
            String ret;
            ret = " ".repeat(level) + data + "\n";
            for (TreeNode node : this.children) {
                ret += node.print(level + 1);
            }
            return ret;
        }
    }

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode wine = new TreeNode("wine");
        TreeNode beer = new TreeNode("beer");
        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(wine);
        cold.addChild(beer);
        System.out.println(drinks.print(0));

    }
}
