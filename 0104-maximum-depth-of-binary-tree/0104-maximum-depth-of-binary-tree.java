class Solution {
    public int maxDepth(TreeNode root) {

        if(root==null){
            return 0;
        }
        int leftcount = 0;
        int rightcount = 0;
        leftcount  = 1 + maxDepth(root.left);
        rightcount  = 1 + maxDepth(root.right);

        return leftcount>rightcount?leftcount:rightcount;
    }
}