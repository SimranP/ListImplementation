public class Node<Type> {
    public Node previous;
    public Type value;
    public Node next;

    public Node(Type v) {
        value = v;
        next = null;
        previous = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        return value != null ? value.equals(node.value) : node.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}
