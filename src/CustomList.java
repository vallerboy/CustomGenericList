import java.util.Iterator;
import java.util.Random;

/**
 * Created by Lenovo on 10.07.2017.
 */
public class CustomList< O > implements Iterator<O>{

    private O[] customArray;
    private Random random;
    private int index;

    public CustomList(O ... elements){
        customArray = elements;
        random = new Random();
    }

    public O getFrist(){
        return customArray[0];
    }

    public O getLast(){
        return customArray[customArray.length-1];
    }

    public void clean() {
        for(O i : customArray){
            i = null;
        }
    }

    public O getRandom() {
        return customArray[random.nextInt(customArray.length-1)];
    }

    public int getLength() {
        return customArray.length;
    }

    @Override
    public boolean hasNext() {
        return index <= customArray.length-1 ? true : false;
    }


    @Override
    public O next() {
        return customArray[index++];
    }
}
