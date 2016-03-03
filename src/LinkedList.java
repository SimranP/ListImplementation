public class LinkedList<Type>{
    private int length;
    protected Node first;
    private Node last;

    public LinkedList() {}

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
            element.previous = last;
            last.next = element;
            last = element;
        }
        length++;
    }

    public void add(Type o){ addLast(o);}

    public boolean contains(Object o) {
        return indexOf(o) != -1 ;
    }

    public int indexOf(Object o) {
        int index = 0;
        Node element = first;
        Node<Object> objectNode = new Node<>(o);
        while(element!=null) {
            if(element.equals(objectNode))
                return index;
            index++;
            element = element.next;
        }
        return -1;
    }
    private boolean isInvalid(int index){
        return index < 0 || index >= size();
    };
    public Object get(int index) {
        if(isInvalid(index))
            throw new IndexOutOfBoundsException("index: "+index + " doesn't exist.");
        Node element = first;
        int i = 0 ;
        while(i!=index) {
            element = element.next;
            i++;
        }
        return element.value;
    }

    public ListIter<Type> listIterator(int index) {
        if(isInvalid(index))
            throw new IndexOutOfBoundsException("Iteration can't proceed from index: "+ index);
        return new ListIter<>(this,index);
    }

    public boolean removeElement(Object o) {
        Node element = first;
        Node<Object> toBeDeleted = new Node<>(o);
        while(element!=null) {
            if(element.equals(toBeDeleted)) {
                if(element.equals(first))
                    removeFirst();
                else if(element.equals(last))
                    removeLast();
                else{
                    element.previous.next = element.next;
                    element.next.previous = element.previous;
                }
                return true;
            }
            element = element.next;
        }
        return false;
    }

    public Object removeFirst() {
        if(first!=null) {
            Object deleted = first.value;
            first = first.next;
            first.previous = null;
            return deleted;
        }
        return null;
    }

    public Object removeLast() {
        if(last!=null) {
            Object deleted = last.value;
            last = last.previous;
            last.next = null;
            return deleted;
        }
        return null;
    }

    public Object remove() {
        return removeFirst();
    }

    public Object peekFirst() {
        if(first==null)
            return null;
        return first.value;
    }

    public Object peekLast() {
        if(last==null)
            return null;
        return last.value;
    }

    public Object peek() {
        return peekFirst();
    }
}
