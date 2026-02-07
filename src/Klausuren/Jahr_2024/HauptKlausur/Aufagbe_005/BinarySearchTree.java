package Klausuren.Jahr_2024.HauptKlausur.Aufagbe_005;

public class BinarySearchTree {
    Node root;

    public boolean isEmpty() {
        if (root == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int value) {
        if (isEmpty()) {
            root = new Node(value, null, null);
        } else {
            add(value, root);
        }
    }

    private void add(int value, Node node) {
        if (value == node.value) {
            return;
        }
        if (value < node.value) {
            if (node.left == null) {
                node.left = new Node(value, null, null);
            } else {
                add(value, node.left);
            }

        } else {
            if (node.right == null) {
                node.right = new Node(value, null, null);
            } else {
                add(value, node.right);
            }
        }
    }


    public String traverseInOrder() {
        if (isEmpty()) {
            return "";
        } else {
            return traverseInOrder(root);
        }
    }

    // IN ORDER --> L W R wobei (L: Links, W: Wurzel, R: Rechts)
    private String traverseInOrder(Node node) {
        String result = "";

        // LEFT
        if (node.left != null) {
            result += traverseInOrder(node.left);
        }

        // ROOT
        result += node.value + " ";

        // Right
        if (node.right != null) {
            result += traverseInOrder(node.right);
        }

        return result;
    }

    public String traversePreOrder() {
        if (isEmpty()) {
            return "";
        } else {
            return traversePreOrder(root);
        }
    }

    // PRE ORDER --> W L R wobei (L: Links, W: Wurzel, R: Rechts)
    private String traversePreOrder(Node node) {
        String result = "";

        // ROOT
        result += node.value + " ";

        // LEFT
        if (node.left != null) {
            result += traversePreOrder(node.left);
        }

        // Right
        if (node.right != null) {
            result += traversePreOrder(node.right);
        }

        return result;
    }


    public String traversePostOrder() {
        if (isEmpty()) {
            return "";
        } else {
            return traversePostOrder(root);
        }
    }

    // PRE ORDER --> L R W wobei (L: Links, W: Wurzel, R: Rechts)
    private String traversePostOrder(Node node) {
        String result = "";

        // LEFT
        if (node.left != null) {
            result += traversePostOrder(node.left);
        }

        // RIGHT
        if (node.left != null) {
            result += traversePostOrder(node.right);
        }

        // ROOT
        result += node.value + " ";

        return result;
    }

    public boolean search(int value) {
        if (isEmpty()) {
            return false;
        } else {
            return search(value, root);
        }
    }

    private boolean search(int value, Node node) {
        if (value == node.value) {
            return true;
        }

        if (value < node.value) {
            if (node.left != null) {
                return search(value, node.left);
            }
        }

        if (value > node.value) {
            if (node.right != null) {
                return search(value, node.right);
            }
        }

        return false;
    }

    public boolean searchIterative(int value) {
        if (isEmpty()) {
            return false;
        } else {
            Node ptr = root;
            while (ptr != null) {
                if (ptr.value == value) {
                    return true;
                } else if (value < ptr.value) {
                    ptr = ptr.left;
                } else {
                    ptr = ptr.right;
                }
            }
            return false;
        }
    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node current) {
        if (current == null) {
            return "";
        }
        return toString(current.left) + current.value + "," + toString(current.right);
    }

    public int[] toArrayReserved() {
        String treeAsString = this.toString();
        String[] splitedString = treeAsString.split(","); //{"-2","1","3","5"}
        int[] reservedArray = new int[splitedString.length];
        int j = 0;
        for (int i = splitedString.length - 1; i >= 0; i--, j++) {
            reservedArray[j] = Integer.parseInt(splitedString[i]);
        }
        return reservedArray;
    }
}
