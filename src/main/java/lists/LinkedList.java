package lists;

public class LinkedList {
    private ListNode head;

    public LinkedList(int[] array){
        this.head = buildList(array);
    }

    public void reverse() {
        ListNode current = head;
        ListNode prev = null;
        ListNode temp = null;
        while (current !=null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
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

    class ListNode {
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
    }

    }
