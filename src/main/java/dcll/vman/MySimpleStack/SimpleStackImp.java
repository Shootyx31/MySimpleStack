package dcll.vman.MySimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by valentin on 24/02/16.
 *
 *  Un commentaire répondant à l'exigence #3
 */
public class SimpleStackImp implements SimpleStack{

    Stack<Object> wrappedStack = new Stack<Object>();
    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
