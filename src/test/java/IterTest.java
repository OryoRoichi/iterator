import org.example.Iter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;


public class IterTest {
    @Test
    public void hasNext_isOk() {
        Iter iter = new Iter("1", "2");
        Assertions.assertEquals(true, iter.hasNext());
        iter.next();
        Assertions.assertEquals(false, iter.hasNext());
    }

    @Test
    public void next_isOk() {
        Iter iter = new Iter("1", "2");
        Assertions.assertEquals("1", iter.next());
        Assertions.assertEquals("2", iter.next());
    }

    @Test
    public void next_shouldThrowException() {
        Iter iter = new Iter("1");
        iter.next();
        Assertions.assertThrows(NoSuchElementException.class, () -> iter.next());
    }

    @Test
    public void remove_isOk() {
        Iter iter = new Iter("1","2");
        iter.next();
        iter.remove();
        Assertions.assertEquals(null , iter.getElem(1) );
    }

    @Test
    public void remove_shouldThrowException(){
        Iter iter = new Iter("1","2");
        Assertions.assertThrows(IllegalStateException.class, ()-> iter.remove());
    }

}
