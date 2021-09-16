package DataStructure;

public class BinaryTree {
    Node root;

    public BinaryTree(int key){
        root=new Node(key);
    }
    public BinaryTree(){
        root=null;
    }

    public void inorder(Node temp){
        if(temp==null){
            return;
        }

        inorder(temp.left);
        inorder(temp.right);
        System.out.print(temp.data+" ");
    }

    public




    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree(1);

        tree.root.right=new Node(3);
        tree.root.left=new Node(2);

        tree.root.left.left=new Node(4);
        tree.root.right.right=new Node(5);
        tree.root.left.right=new Node(9);
        tree.root.right.left=new Node(10);
        tree.inorder(tree.root);

    }

    private static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data=data;
            right=left=null;
        }
    }
}
