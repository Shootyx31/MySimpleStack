package dcll.vman.MySimpleStack;

import java.util.EmptyStackException;

/**
 * Created by valentin on 24/02/16.
 */
public interface SimpleStack {

    /**
     * Test if this stack is empty
     */
    public boolean isEmpty();

    /**
     * Returns the numbers of items in this stack
     */
    public int getSize();

    /**
     * Pushes an item onto the top of this stack
     */
    public void push(Item item);

    /**
     * Looks at the object at the top of this stack without removing it from the stack
     */
    public Item peek() throws EmptyStackException;

    /**
     * Remove the
     */
    public Item pop() throws EmptyStackException;
}

