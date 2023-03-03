package Iterator;

import java.util.Iterator;
import java.util.Random;

public class FullNameCollections implements Iterable<FullName> {
    private final FullName[] array;

    public FullNameCollections(String[] name) {
        array = new FullName[name.length];
        for (int i = 0; i < name.length; i++) {
            array[i] = new FullName("mr " + name[i], name[i], new Random().nextInt(100));
        }
    }

    public int getSize() {
        return array.length;
    }

    @Override
    public Iterator<FullName> iterator() {
        return new Iterator<FullName>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public FullName next() {
                return array[index++];
            }
        };
    }
}