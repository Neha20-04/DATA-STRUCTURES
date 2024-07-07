import java.util.*;

public class subtree {
    public boolean isIdentical(TreeNode left, TreeNode right) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }

    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,Subroot)){
                return true;
            }


        }
        isSubtree(root.left,subRoot)|| issunRoot(root.right,subRoot){

        }

    }
}

// One sub tree is already given we have to find wether this subtree is present
// in main tree or not.
