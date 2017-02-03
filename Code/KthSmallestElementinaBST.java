public int kthSmallest(TreeNode root, int k) {
        int count = nodes(root.left);
        if(count > k-1) return kthSmallest(root.left,k);
        else if(count<k-1) return kthSmallest(root.right, k - count -1);
        
    return root.val;
    }
    
    public int nodes(TreeNode root){
        if(root == null) return 0;
        if(root == null) return 0;
        return (1 + nodes(root.left) + nodes(root.right)); 
    }