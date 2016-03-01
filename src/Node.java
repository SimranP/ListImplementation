/**
 * Created by simranp on 01/03/16.
 */
public class Node<Type> {

    public int index;
    public Type value;
    public Node next;

    public Node(Type value) {
        this.value = value;
        this.next = null;
        this.index = -1;
    }
}
