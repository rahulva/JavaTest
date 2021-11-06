package com.test.core.threading.fork_join_pool;

import java.util.Set;

class TreeNode {


    int value;

    Set<TreeNode> children;

    TreeNode(int value, TreeNode... children) {
        this.value = value;
        this.children = Set.of(children);//s.newHashSet(children);
    }
}
