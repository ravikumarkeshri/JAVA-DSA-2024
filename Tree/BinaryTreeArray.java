public class BinaryTreeArray {
    public class BinaryTree {
        String arr[];
        int lastUsedIndex;

        BinaryTree(int size) {
            arr = new String[size + 1];
            this.lastUsedIndex = 0;
            System.out.println("A Tree of size " + size + " is created");
        }

        public boolean isFull() {
            if (arr.length - 1 == lastUsedIndex) {
                return true;
            }
            return false;
        }

        public void insert(String value) {
            if (!isFull()) {
                arr[lastUsedIndex + 1] = value;
                lastUsedIndex++;
                System.out.println(value + " inserted Successfully...");

            } else {
                System.out.println("Tree is full");
            }
        }

        public void preOrder(int index) {
            if (index > lastUsedIndex) {
                return;
            }
            System.out.print(arr[index] + " ");
            if (index != arr.length - 1) {
                System.out.print(" -> ");
            }
            preOrder(index * 2);
            preOrder(index * 2 + 1);
        }

    }

    public static void main(String[] args) {
        BinaryTreeArray tree = new BinaryTreeArray();
        BinaryTree btree = tree.new BinaryTree(7);
        btree.insert("N1");
        btree.insert("N2");
        btree.insert("N3");
        btree.insert("N4");
        btree.insert("N5");
        btree.insert("N6");
        btree.insert("N7");
        btree.preOrder(1);

    }
}
