package com.java.practice.hr.test01;

public class ConcreteVisitor extends TreeVis {
    private int redNodeSum = 0;
    private int greenLeafCount = 0;

    @Override
    public int getResult() {
        return redNodeSum + greenLeafCount;
    }

    @Override
    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            redNodeSum += node.getValue();
        }
    }

    @Override
    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            greenLeafCount++;
        }
    }
}
