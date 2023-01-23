class insertkey{
        Node insert(Node root, int Key) {
        // your code here
        if(root==null) return new Node(key);
        if(root.data>Key) root.left=insert(root.left,Key);
        if(root.data<Key) root.right=insert(root.right,Key);
        return root;
    }
}