package dcll.vman.MySimpleStack;

/**
 * Created by valentin on 24/02/16.
 */
public class Item {
    private Object value;

    public Item(Object value){
        setValue(value);
    }

    /**
     * exigence #1
     * @return
     */
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
