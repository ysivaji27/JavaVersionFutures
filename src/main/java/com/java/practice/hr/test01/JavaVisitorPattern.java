package com.java.practice.hr.test01;

public class JavaVisitorPattern {
    public static void main(String[] args) {
        // Example usage of the Visitor Pattern
        TreeNode root = new TreeNode(1, Color.RED, 0);
        TreeNode child1 = new TreeNode(2, Color.GREEN, 1);
        TreeLeaf leaf1 = new TreeLeaf(3, Color.RED, 2);

        root.addChild(child1);
        child1.addChild(leaf1);

        // Create a visitor and visit the tree
        TreeVis visitor = new ConcreteVisitor();
        root.accept(visitor);
    }
}
