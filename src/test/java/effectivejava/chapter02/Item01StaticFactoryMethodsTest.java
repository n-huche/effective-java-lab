package effectivejava.chapter02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/** Item 1: Consider static factory methods instead of constructors */
class Item01StaticFactoryMethodsTest {

    @Test
    void experiment() {
        assertSame(false, valueOf(false));
    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
 