package design;

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    private final List<Integer> list;
    private int minEl;

    /** initialize your data structure here. */
    public MinStack() {
        this.list = new ArrayList<>();
        minEl = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val < minEl)  minEl = val;
        list.add(val);
    }

    public void pop() {
        int val = list.remove(list.size() - 1);
        if (val == minEl) {
            updateMin();
        }
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minEl;
    }

    private void updateMin() {
        minEl = Integer.MAX_VALUE;
        for (int i: list) {
            if (i < minEl) minEl = i;
        }
    }
}