class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        preOrder(root, result);
        return result;
    }

    public static void preOrder(TreeNode root, List<Integer> result){
        if(root== null){
            return;
        }
        result.add(root.val);
        preOrder(root.left,result);
        preOrder(root.right,result);
    }
}