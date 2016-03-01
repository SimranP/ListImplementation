public class LinkedList<Type>{
    private int length;
    private Node first;
    private Node last;

    public LinkedList() {
        length = 0;
        first = null;
        last = null;
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length==0;
    }

    public void addLast(Type o) {
        Node<Type> element = new Node<>(o);
        if(first == null) {
            first = element;
            last = element;
        }else {
            last.next = element;
            last = element;
        }
        length++;
    }

    public void add(Type o){ addLast(o);}

    public boolean contains(Type o) {
        return indexOf(o) != -1 ;
    }

    public int indexOf(Type o) {
        int index = 0;
        Node element = first;
        while(element!=null) {
            if(element.equals(new Node<>(o)))
                return index;
            index++;
            element = element.next;
        }
        return -1;
    }

    public Object get(int index) {
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException("index: "+index + " doesn't exist.");
        Node element = first;
        int i = 0 ;
        while(i!=index) {
            element = element.next;
            i++;
        }
        return element.value;
    }
}
