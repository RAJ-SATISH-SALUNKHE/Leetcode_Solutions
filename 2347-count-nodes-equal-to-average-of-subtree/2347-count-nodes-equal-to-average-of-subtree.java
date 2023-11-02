import java.util.*;

public class Pair<A, B> {
    private A first;
    private B second;

    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }
}

class Solution {

    int totalCount = 0;

    Pair<Integer, Integer> Traverse(TreeNode root) {
        if (root == null) {
            return new Pair<>(0, 0);
        }

        Pair<Integer, Integer> left = Traverse(root.left);
        Pair<Integer, Integer> right = Traverse(root.right);

        int sum = left.getFirst() + right.getFirst() + root.val;
        int count = left.getSecond() + right.getSecond() + 1;

        if (sum / count == root.val) {
            totalCount++;
        }

        return new Pair<>(sum, count);
    }

    public int averageOfSubtree(TreeNode root) {
        Traverse(root);
        return totalCount;
    }
}
