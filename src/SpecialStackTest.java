

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SpecialStackTest {

    private SpecialStack stack;

    @Before
    public void initialize(){
        stack = new SpecialStack();
    }
    
    @Test
    public void testStackStartsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushMeansStackIsNotEmpty(){
        stack.push(Integer.valueOf(1));
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopReturnsTopElement(){
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
    }

    @Test
    public void testPopRemovesTopElement(){
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(1), stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeekDoesNotRemoveElement(){
        stack.push(1);
        assertEquals(Integer.valueOf(1),stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testGetMinPush1Element(){
        stack.push(1);
        assertEquals(Integer.valueOf(1),stack.getMin());
    }

    @Test
    public void testGetMinPush2ElementsFirstIsMin(){
        stack.push(1);
        stack.push(2);
        assertEquals(Integer.valueOf(1),stack.getMin());
    }
    @Test
    public void testGetMinPush2ElementSecondIsMin(){
        stack.push(2);
        stack.push(1);
        assertEquals(Integer.valueOf(1),stack.getMin());
    }
    @Test
    public void testGetMinPush3ElementSecondIsMin(){
        stack.push(2);
        stack.push(1);
        stack.push(3);
        assertEquals(Integer.valueOf(1),stack.getMin());
    }

    @Test
    public void testPopMinWith2Elements(){
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertEquals(Integer.valueOf(2),stack.getMin());
    }
    @Test
    public void testPopMinWith3Elements(){
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        assertEquals(Integer.valueOf(2),stack.getMin());
    }
    @Test
    public void testPopMaxWith3Elements(){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertEquals(Integer.valueOf(1),stack.getMin());
    }


}
