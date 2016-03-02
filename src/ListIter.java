public class ListIter<E> {
    private LinkedList<E> list;
    private Node currentItem;
    private int currentIndex;

    public ListIter(LinkedList<E> l,int initialIndex) {
        list = l;
        currentItem = getNode(initialIndex);
        currentIndex = initialIndex;
    }

    private Node getNode(int initialIndex) {
        Node node = list.first;
        int index = 0;
        while(index!= initialIndex){
            node = node.next;
            index++;
        }
        return node;
    }

    public boolean hasNext() {
        return currentIndex < list.size();
    }

    public boolean hasPrevious() {
        return currentItem.previous!=null;
    }

    public Object next() throws IndexOutOfBoundsException{
        Object nextElement = list.get(currentIndex);
        currentItem = currentItem.next;
        currentIndex++;
        return nextElement;
    }

    public Object previous() throws IndexOutOfBoundsException{
        currentItem = currentItem.previous;
        currentIndex--;
        return list.get(currentIndex);
    }

    public int nextIndex() {
        return currentIndex;
    }

    public int previousIndex() {
        return currentIndex-1;
    }
}
