import org.junit.Test;
import static org.junit.Assert.*;

public class ListIteratorTest{

    @Test
    public void hasNext_gives_false_when_there_is_no_next_elements() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        ListIter<String> itr= list.listIterator(0);
        assertFalse(itr.hasNext());
    }

    @Test
    public void hasNext_gives_true_when_there_is_any_next_element() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(0);
        assertTrue(itr.hasNext());
    }

    @Test
    public void hasPrevious_gives_false_when_there_is_no_previous_elements() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        ListIter<String> itr= list.listIterator(0);
        assertFalse(itr.hasPrevious());
    }


    @Test
    public void hasPrevious_gives_true_when_there_is_any_previous_element() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(1);
        assertTrue(itr.hasPrevious());
    }

    @Test
    public void next_gives_the_element_in_the_iteration() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(0);
        assertEquals("firstNode",itr.next());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void next_throws_the_exception_if_there_is_no_next_element() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(2);
        itr.next();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void previous_throws_the_exception_if_there_is_no_next_element() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(0);
        itr.previous();
    }

    @Test
    public void previous_give_the_previous_if_there_is_any_previous_element() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(1);
        assertEquals(itr.previous(),"firstNode");
    }

    @Test
    public void nextIndex_gives_next_Index_in_the_iteration() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(1);
        assertEquals(itr.nextIndex(),1);
    }

    @Test
    public void previousIndex_gives_next_Index_in_the_iteration() throws Exception {
        LinkedList<String> list= new LinkedList<>();
        list.add("firstNode");
        list.add("secondNode");
        ListIter<String> itr= list.listIterator(1);
        assertEquals(itr.previousIndex(),0);
    }
}