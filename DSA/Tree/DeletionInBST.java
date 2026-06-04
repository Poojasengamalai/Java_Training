package DSA.Tree;

class DBSNode{
    int data;
    DBSNode left, right;

    DBSNode(int val){
        this.data = val;
        right = left = null;
    }
}

class DeletionBST{
    DBSNode root;
    DeletionBST(){
        root = null;
    }

    DBSNode insert(int data, DBSNode root){
        if(root == null){
            return new DBSNode(data);
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }else{
            root.right = insert(data, root.right);
        }
        return root;
    }

    DBSNode delete(int data, DBSNode root){
        if(root == null){
            return null;
        }
        if(data < root.data){
            root.left = delete(data, root.left);
        }
        else if(data > root.data){
            root.right = delete(data, root.right);
        }
        else{
            // case 1 : No Child
            if(root.right == null && root.left == null){
                return null;
            }

            // case 2 : Single/One Child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            // case 3 : Two Child
            DBSNode min = findmin(root.right);
            root.data = min.data;
            root.right = delete(min.data, root.right);
        }
        return root;
    }

    DBSNode findmin(DBSNode root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    boolean searching(int target, DBSNode root){
        if(root == null)
            return false;
        if(root.data == target){
            return true;
        }
        if(target < root.data)
            return searching(target, root.left);
        else
            return searching(target, root.right);
    }

    void preorder(DBSNode root){
        if(root == null){  // if thsi condition is not set then stack over
            return;
    }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(DBSNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void inorder(DBSNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

}

public class DeletionInBST {
    public static void main(String[] args) {
        DeletionBST bst = new DeletionBST();

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
        System.out.println("In-Order");
        bst.inorder(bst.root);
        System.out.println();
    }
}

