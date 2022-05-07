import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class maxminTest {
    maxmin mn ;
    int arr[] = new int[5];

    maxminTest(){
        arr[0]=4;
        arr[1]=5;
        arr[2]=1;
        arr[3]=3;
        arr[4]=2;
        mn= new maxmin();
    }


    @Test
    public void maxValuetest() {


        assertEquals(5, mn.maxValue(arr));

    }

    @Test
    public void minValuetest() {
        assertEquals(1, mn.minValue(arr));
    }
}