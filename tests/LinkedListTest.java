import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {
    @Test
    public void add_adds_the_given_element_into_the_list() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        assertEquals(linkedList.size(),1);
    }

    @Test
    public void contains_checks_if_the_given_element_is_present_in_the_list() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        linkedList.add("secondNode");

        assertEquals(linkedList.contains("firstNode"),true);
        assertEquals(linkedList.contains("secondNode"),true);
        assertEquals(linkedList.contains("thirdNode"),false);
    }

    @Test
    public void indexOf_gives_the_index_of_given_element_in_the_list() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        linkedList.add("secondNode");

        assertEquals(linkedList.indexOf("firstNode"),0);
        assertEquals(linkedList.indexOf("secondNode"),1);
    }

    @Test
    public void indexOf_gives_the_minus_one_if_given_element_is_not_present_in_the_list() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();

        assertEquals(linkedList.indexOf("firstNode"),-1);
        assertEquals(linkedList.indexOf("invisible"),-1);
    }

    @Test
    public void get_returns_the_element_on_given_index() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        linkedList.add("secondNode");
        assertEquals(linkedList.get(0),"firstNode");
        assertEquals(linkedList.get(1),"secondNode");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void get_throws_IndexOutOfBoundException_when_given_index_is_invalid() throws Exception{
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");

        linkedList.add("secondNode");
        linkedList.get(2);
    }

    @Test
    public void isEmpty_returns_true_when_list_is_empty() {
        LinkedList<String> linkedList = new LinkedList<>();
        assertEquals(true,linkedList.isEmpty());
    }

    @Test
    public void isEmpty_returns_false_when_list_is_empty() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        assertEquals(false,linkedList.isEmpty());
    }

    @Test
    public void removeFirst_removes_the_first_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        list.removeFirst();
        assertFalse(list.contains("firstNode"));
    }

    @Test
    public void removeLast_does_nothing_when_there_is_no_element() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(null,list.removeLast());
    }

    @Test
    public void removeFirst_does_nothing_when_there_is_no_element() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(null,list.removeFirst());
    }

    @Test
    public void removeLast_removes_the_last_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        assertEquals("secondNode",list.removeLast());
    }

    @Test
    public void remove_removes_the_first_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        assertEquals("firstNode",list.remove());
    }

    @Test
    public void removeElement_removes_the_first_occurrence_of_the_given_element_from_the_list_and_returns_true() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        assertTrue(list.removeElement("firstNode"));
    }

    @Test
    public void removeElement_returns_false_if_the_given_element_is_not_in__the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("secondNode");
        assertFalse(list.removeElement("firstNode"));
    }

    @Test
    public void peek_gives_the_first_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        assertEquals("firstNode",list.peek());
    }
    @Test
    public void peekFirst_gives_the_first_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        assertEquals("firstNode",list.peekFirst());
    }

    @Test
    public void peekLast_gives_the_first_element_from_the_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        list.add("firstNode");
        assertEquals("firstNode",list.peekLast());
    }

    @Test
    public void peekLast_gives_null_for_an_empty_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(null,list.peekLast());
    }

    @Test
    public void peekFirst_gives_null_for_an_empty_list() throws Exception {
        LinkedList<String> list = new LinkedList<>();
        assertEquals(null,list.peekFirst());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void listIterator_throws_index_out_of_bound_exception_if_given_index_is_invalid() throws Exception {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("firstNode");
        linkedList.add("secondNode");
        linkedList.listIterator(2);
    }
}