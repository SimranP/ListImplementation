public class LinkedList{
    private int length;
    private Node first;
    private Node last;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length==0;
    }

    public boolean add(Object o) {
        Node element  = (Node) o;
        if(first == null) {
            first = element;
            last = element;
            element.index = length;
            length++;
            return true;
        }
        last.next = element;
        last = element;
        element.index = length;
        length++;
        return true;
    }

    public boolean contains(Object o) {
        return indexOf(o) != -1 ;
    }

    public int indexOf(Object o) {
        if(!(o instanceof Node))
            return -1;
        Node element = (Node) o;
        return element.index;
    }

    public Object get(int index) {
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException("index: "+index + " doesn't exist.");
        Node element = first;
        while(indexOf(element)!=index)
            element = element.next;
        return element;
    }
}
