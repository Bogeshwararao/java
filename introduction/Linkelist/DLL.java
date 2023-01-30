package introduction.Linkelist;

public class DLL {
    private class Node{
    private int  value;
    private Node next;
    private Node prev;
    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next , Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }
}
}
