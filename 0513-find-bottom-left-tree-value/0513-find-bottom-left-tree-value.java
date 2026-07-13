class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        TreeNode curr = root;
        while(!q.isEmpty()){
            curr = q.poll();
            if(curr.right!= null){
                q.offer(curr.right);
            }
            if(curr.left!= null){
                q.offer(curr.left);
            }
        }
        return curr.val;
    }
}