package at.fhj.iit;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringStackTest
{
    public Stack s;
    
    @Before
    public void setup() throws Exception
    {
        s = new StringStack(5); // keep size of 5 !!
    }
    
    /**
     * tests if stack is empty after initialization
     * 
     * use assert
     * - assertTrue to check it's empty
     */
    @Test
    public void testIsEmpty() throws Exception
    {
        boolean var = s.isEmpty();
        assertTrue(var);
    }
    
    /**
     * tests if stack is empty after pushing
     * 
     * use assert
     * - assertFalse to check it's not empty
     */
    @Test
    public void testIsNotEmpty() throws Exception
    {
        s.push("hallo");
        boolean var = s.isEmpty();
        assertFalse(var);
    }

    /**
     * tests push and pop function
     * 
     * do following test
     * - use push, 1 or x times
     * - use pull, as often as you use push
     * - use isEmpty to check that's empty again
     * - assert every content of the stack in the correct ordering
     * @throws Exception 
     */
    @Test
    public void testPushPop() throws Exception
    {
        s.push("Daniel");
        s.push("Stephany");
        s.pop();
        s.pop();
        boolean var = s.isEmpty();
        assertTrue(var);
    }
    
    /**
     * Feel Free to insert other test cases for the String Stack Implementation !!!
     */
    
    //push 3 elements onto the stack, remove 2 and check if its not empty
    @Test
    public void testPushPop2() throws Exception
    {
        s.push("1");
        s.push("2");
        s.push("3");
        s.pop();
        s.pop();
        boolean var = s.isEmpty();
        assertFalse(var);
    }
    
    //push one element onto the stack, then pop it and check if it is still the same element
    @Test
    public void testPushPop3() throws Exception
    {
        s.push("1");
        String var = s.pop();
        assertTrue(var.contentEquals("1"));
    }
    
    //push multiple elements onto the stack and check if
    //they are popped from it in the right order
    @Test
    public void testPushPopOrder() throws Exception
    {
        s.push("1");
        s.push("2");
        s.push("3");
        s.push("4");
        String var = s.pop();
        assertTrue(var.contentEquals("4"));
        var = s.pop();
        assertTrue(var.contentEquals("3"));
        var = s.pop();
        assertTrue(var.contentEquals("2"));
        var = s.pop();
        assertTrue(var.contentEquals("1"));
    }
    
    //use pop method even though the stack is empty
    //and check if an exception is thrown
    @Test(expected = IllegalStateException.class)
    public void testPopEmptyStack() throws Exception
    {
        s.pop();
    }
}
