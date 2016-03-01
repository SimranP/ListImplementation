import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    @Test
    public void add_adds_the_given_element_into_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);
        assertEquals(linkedList.size(),1);
    }

    @Test
    public void contains_checks_if_the_given_element_is_present_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        Node<String> thirdNode = new Node<>("thirdNode");
        linkedList.add(firstNode);
        linkedList.add(secondNode);

        assertEquals(linkedList.contains(firstNode),true);
        assertEquals(linkedList.contains(secondNode),true);
        assertEquals(linkedList.contains(thirdNode),false);
    }

    @Test
    public void indexOf_gives_the_index_of_given_element_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(firstNode);
        linkedList.add(secondNode);

        assertEquals(linkedList.indexOf(firstNode),0);
        assertEquals(linkedList.indexOf(secondNode),1);
    }

    @Test
    public void indexOf_gives_the_minus_one_if_given_element_is_not_present_in_the_list() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");

        assertEquals(linkedList.indexOf(firstNode),-1);
        assertEquals(linkedList.indexOf("invisible"),-1);
    }

    @Test
    public void get_returns_the_element_on_given_index() throws Exception {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        assertEquals(linkedList.get(0),firstNode);
        assertEquals(linkedList.get(1),secondNode);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_throws_IndexOutOfBoundException_when_given_index_is_invalid() throws Exception{
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);

        Node<String> secondNode = new Node<>("secondNode");
        linkedList.add(secondNode);
        linkedList.get(2);
    }

    @Test
    public void isEmpty_returns_true_when_list_is_empty() {
        LinkedList linkedList = new LinkedList();
        assertEquals(true,linkedList.isEmpty());
    }

    @Test
    public void isEmpty_returns_false_when_list_is_empty() {
        LinkedList linkedList = new LinkedList();
        Node<String> firstNode = new Node<>("firstNode");
        linkedList.add(firstNode);
        assertEquals(false,linkedList.isEmpty());
    }

    @Test
    public void iterator() {
        LinkedList linkedList = new LinkedList();
    }
}