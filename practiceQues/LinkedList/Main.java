public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node n1 = new Node();
        n1.value = "n1";
        Node n2 = new Node();
        n2.value = "n2";
        Node n3 = new Node();
        n3.value = "n3";
        Node n4 = new Node();
        n4.value = "n4";
        Node n5 = new Node();
        n5.value = "n5";
        bt.root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        bt.postorder(bt.root);
    }

}
