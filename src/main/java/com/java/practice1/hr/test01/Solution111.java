package com.java.practice1.hr.test01;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sumInLeavesVisitor = 0;
    public int getResult() {
        //implement this
        return sumInLeavesVisitor;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        sumInLeavesVisitor += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private int productOfRedNodesVisitor = 1;
    final private int mod = 1000000007;
    public int getResult() {
        //implement this
        return productOfRedNodesVisitor;
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getColor() == Color.RED)productOfRedNodesVisitor = (int)(((long)productOfRedNodesVisitor * node.getValue()) % mod);
    }
    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor() == Color.RED)productOfRedNodesVisitor = (int)(((long)productOfRedNodesVisitor * leaf.getValue()) % mod);
    }
}

class FancyVisitor extends TreeVis {
    private int nonLeafValue = 0;
    private int leafValue = 0;
    public int getResult() {
        //implement this
        int difference = leafValue - nonLeafValue;
        return Math.abs(difference);
    }

    public void visitNode(TreeNode node) {
        //implement this
        if(node.getDepth() % 2 == 0)nonLeafValue += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
        if(leaf.getColor() == Color.GREEN)leafValue += leaf.getValue();
    }
}

public class Solution111 {

    public static Tree solve() {
        //read the tree from STDIN and return its root as a return value of this function
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nodeValues = new int[n];
        Color[] nodeColors = new Color[n];
        List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++){
            nodeValues[i] = sc.nextInt();
            adjList.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < n; i++){
            nodeColors[i] = sc.nextInt() == 0 ? Color.RED : Color.GREEN;
        }

        Tree[] treeNodes = new Tree[n];
        treeNodes[0] = new TreeNode(nodeValues[0], nodeColors[0], 0);
        Queue<Integer> parentQueue = new LinkedList<>();
        parentQueue.add(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;

        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        while(!parentQueue.isEmpty()){
            int parentIndex = parentQueue.poll();
            Tree parent = treeNodes[parentIndex];
            for(int childIndex : adjList.get(parentIndex)){
                if(!visited[childIndex]){
                    Tree child;
                    if(adjList.get(childIndex).size() == 1){
                        child = new TreeLeaf(nodeValues[childIndex], nodeColors[childIndex], parent.getDepth() + 1);
                    }
                    else{
                        child = new TreeNode(nodeValues[childIndex], nodeColors[childIndex], parent.getDepth() + 1);
                    }
                    treeNodes[childIndex] = child;
                    visited[childIndex] = true;
                    parentQueue.add(childIndex);
                    ((TreeNode) parent).addChild(child);
                }
            }
        }
        return treeNodes[0];

    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}