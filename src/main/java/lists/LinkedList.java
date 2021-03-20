package lists;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class LinkedList {
    private ListNode head;
    private ListNode next;

    public LinkedList(int[] array){
        this.head = buildList(array);
        this.next = head.next;
    }

    public LinkedList() {
        this.head = new ListNode();
    }

    public void reverse() {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null)
        {
           next = current.next;
           current.next = prev;
           prev = current;
           current = next;

        }
        head = prev;
    }

    public int[] toArray(){

        int[] array = new int[getLength()];
        ListNode current = head;
        int i = 0;
        while (current != null)
        {
            array[i] = current.val;
            current = current.next;
            i++;
        }
        return array;
    }

    public int getLength()
    {
        ListNode current = head;
        int length = 0;
        while (current != null)
        {
            current = current.next;
            length++;
        }
        return length;
    }

    public LinkedList mergeSorted(LinkedList list) {
        LinkedList result = new LinkedList();
        result.head = append(this.head, list.head);
        return result;
    }

    public LinkedList setNext(ListNode node) {
        if (head == null) {
            head = node;
            next = head;
        }
        else next = node;
        return this;
    }


    public boolean hasCycle() {
        HashSet<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (set.contains(current)) {
                return true;
            }
            set.add(current);
            current = current.next;
        }
        return false;
    }

    private ListNode append(ListNode a, ListNode b) {
        if (a == null && b == null) {
            return null;
        } else if (a == null) return b;
        else if (b == null) return a;
        else {
            ListNode result;
            if (a.compareTo(b) <= 0) {
                result = a;
                result.next = append(a.next, b);
            } else {
                result = b;
                result.next = append(b.next, a);
            }
            return result;
        }
    }


    private ListNode buildList(int[] array) {
        return build(array, 0);
    }

    private ListNode build(int[] array, int i){
        if (i<array.length)
        {
            return new ListNode(array[i], build(array, i+1));
        }
        return null;
    }

   public class ListNode implements Comparable<ListNode>{
        private int val;
        private ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode getNext() {
            return next;
        }

        public int getValue() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public int compareTo(ListNode o) {
            if (o == null) return 0;
            if (this.val > o.val) return 1;
            else if (this.val < o.val) return -1;
            return 0;
        }
    }

    }
