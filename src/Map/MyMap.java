package Map;

import java.util.ArrayList;

public class MyMap<B1, B2> {
    private ArrayList<B1> keys;
    private ArrayList<B2> val;

    public MyMap() {
        keys = new ArrayList<>();
        val = new ArrayList<>();
    }

    public void put(B1 key, B2 value) {
        int index = keys.indexOf(key);
        if (index == -1) {
            keys.add(key);
            val.add(value);
        } else {
            val.set(index, value);
        }
    }

    public B2 get(B2 key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        } else {
            return val.get(index);
        }
    }

    public B2 remove(B1 key) {
        int index = keys.indexOf(key);
        if (index == -1) {
            return null;
        } else {
            keys.remove(index);
            return val.remove(index);
        }
    }
}