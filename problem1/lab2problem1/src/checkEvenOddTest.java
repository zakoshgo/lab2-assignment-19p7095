import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Nested;

import static org.junit.jupiter.api.Assertions.*;

class checkEvenOddTest {

    checkEvenOdd check;

    @BeforeEach
    public void init(){
        check = new checkEvenOdd();
    }

    @Test
    public void testeventrue() {
        assertEquals(true, check.checkEven(2));

    }

    @Test
    public void testevenfalse() {
        assertEquals(false, check.checkEven(3));
    }

    @Test
    public void testoddtrue() {
        assertEquals(true, check.checkOdd(3));
    }

    @Test
    public void testoddfalse() {
        assertEquals(false, check.checkOdd(2));
    }



    @AfterEach
    public void clear(){
        check = null;
    }



}