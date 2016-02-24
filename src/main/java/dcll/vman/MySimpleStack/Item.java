package dcll.vman.MySimpleStack;

import org.omg.CORBA.Object;

/**
 * Created by valentin on 24/02/16.
 */
public class Item {
    private Object value;

    Item(Object value){
        setValue(value);
    }

    /**
     * j'ai modifié ca
     * @return
     */
    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }
}
