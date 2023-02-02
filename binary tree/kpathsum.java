class kpathsum {

  public int pathSumt(TreeNode root, int sum) {
    if (root == null) return 0;
    return (
      (root.val == sum ? 1 : 0) +
      pathSumt(root.left, sum - root.val) +
      pathSumt(root.right, sum - root.val)
    );
  }

  public int pathSum(TreeNode root, int sum) {
    if (root == null) return 0;
    return (
      pathSumt(root, sum) + pathSumt(root.left, sum) + pathSumt(root.right, sum)
    );
  }
}
