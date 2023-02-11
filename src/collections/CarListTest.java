package collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CarListTest {

    private CarList carList;


    @BeforeEach
    void setUp() throws Exception{
        //init
        carList = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("brend"+i, i));
        }
        System.out.println("carList - создан");
    }

    @Test
    void get() {
    }

    @Test
    void add() {

        assertEquals(100,carList.size());
    }

    @Test
    void remove() throws Exception {

        Car car = new Car("Toyota", 15);
        carList.add(car);
        assertEquals(101,carList.size());
        assertTrue(carList.remove(car));
        assertEquals(100,carList.size());
    }




    @Test
    void removeAt() {
        assertTrue(carList.removeAt(5));
        assertEquals(99,carList.size());
    }

    @Test
    void size() {
    }

    @Test
    void clear() {
        carList.clear();
        assertEquals(0, carList.size());

    }


    @Test//(expected = IndexOutOfBoundsException.class)
    public void whenIOBException(){
       

        assertThrows(IndexOutOfBoundsException.class, (Executable) carList.get(100));

    }


}