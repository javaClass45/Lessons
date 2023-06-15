package reflection.fields;

import collections.CarArrayList;

import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;


//todo  от 1 до 2 блок не дописан, ошибки закоментированы
//1
public class FieldEnumerator implements Iterable<Field>  {

    private ArrayList<Field> fields;
    private Object object;


    private ArrayList<Field> incognito() {
        fields = new ArrayList<>();
        return fields;
    }



//2
    public FieldEnumerator(Object object) {
        this.object = object;
        Field[] fieldArray = object.getClass().getDeclaredFields();
        for (Field field : fieldArray) {
            if (!Modifier.isStatic(field.getModifiers())) {
                fields.add(field);
                field.setAccessible(true);
            }
        }

    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Iterator<Field> iterator() {
        return new FieldIterator();
    }

    @Override
    public Spliterator<Field> spliterator() {
        return null;
    }

    public class FieldIterator implements Iterator<Field> {


        private int position = 0;

        private FieldIterator() {
        }

        @Override
        public boolean hasNext() {
            return position < fields.size();
        }

        @Override
        public Field next() {
            java.lang.reflect.Field field = fields.get(position);
            field.setAccessible(true);
            position++;
            try {
                return new java.lang.reflect.Field(field.getName(),
                        field.get(object));
            } catch (IllegalAccessException e) {
                return null;
            }


            return null;
        }
    }


}

