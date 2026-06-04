package DSA.Tree;

class BSNode{
    int data;
    BSNode left, right;

    BSNode(int val){
        this.data = val;
        right = left = null;
    }
}

class BinarySearchTree{
    BSNode root;
    BinarySearchTree(){
        root = null;
    }

    BSNode insert(int data, BSNode root){
        if(root == null){
            return new BSNode(data);
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }else{
            root.right = insert(data, root.right);
        }
        return root;
    }

    void preorder(BSNode root){
            if(root == null){  // if thsi condition is not set then stack over
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
    }

    void postorder(BSNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void inorder(BSNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

public class Tree_BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.root = bst.insert(50,bst.root);
        bst.root = bst.insert(30,bst.root);
        bst.root = bst.insert(72,bst.root);
        bst.root = bst.insert(41,bst.root);
        bst.root = bst.insert(20,bst.root);
        bst.root = bst.insert(79,bst.root);
        bst.root = bst.insert(65,bst.root);
        bst.root = bst.insert(12,bst.root);
        bst.root = bst.insert(38,bst.root);
        bst.root = bst.insert(29,bst.root);
        bst.root = bst.insert(17,bst.root);

        // System.out.println("Pre-Order");
        // bst.preorder(bst.root);
        // System.out.println();
        System.out.println("Post-Order");
        bst.inorder(bst.root);
        System.out.println();
    }
}
