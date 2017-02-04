TreeNode root;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {
        this.root = root;
        
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (stack.isEmpty() && root==null)?false: true;
    }

    /** @return the next smallest number */
    public int next() {
        while(root != null){
            stack.push(root);
            root = root.left;
        }
        TreeNode value = stack.pop();
        root = value.right;
        return value.val;
    }
