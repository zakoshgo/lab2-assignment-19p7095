import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myClockTest {


    @Test
    public void test1() {
        myClock t = new myClock();
        assertEquals("normal TIME 2000-1-1 0:0", t.modifyState("abadcaaaaa"));
    }
    @Test
    public void t() {
        myClock tester = new myClock();
        assertEquals("updateset yer 2002-1-1 0:0", tester.modifyState("acaaaabb"));
    }



    @Test
    public void test3() {
        myClock t = new myClock();
        assertEquals("normal TIME 2000-1-1 0:0", t.modifyState(" "));
    }

    @Test
    public void test4() {
        myClock t = new myClock();
        assertEquals("normal DATE 2000-1-1 0:0", t.modifyState("a"));
    }

    @Test
    public void test5() {
        myClock t = new myClock();
        assertEquals("normal TIME 2000-1-1 0:0", t.modifyState("aa"));
    }

    @Test
    public void test6() {
        myClock t = new myClock();
        assertEquals("alarmset alarm 2000-1-1 0:0", t.modifyState("b"));
    }


    @Test
    public void test7() {
        myClock t = new myClock();
        assertEquals("updateset day 2000-1-1 0:0", t.modifyState("caa"));
    }

    @Test
    public void test8() {
        myClock t = new myClock();
        assertEquals("updateset month 2000-1-1 0:0", t.modifyState("caaa"));
    }







    @Test
    public void test9() {
        myClock t = new myClock();
        assertEquals("updateset month 2000-2-1 0:0", t.modifyState("caaab"));
    }



    @Test
    public void testincmin() {
        myClock t = new myClock();
        int actual = 0;
        for(int i = 0; i < 61; i++){
            actual+=1;
            if(actual>=60) actual%=60;
            assertEquals(actual,t.incminits());
        }
    }

    @Test
    public void testinchour() {
        myClock t = new myClock();
        int actual = 0;
        for(int i = 0; i < 25; i++){
            actual+=1;
            if(actual>=24) actual%=24;
            assertEquals(actual,t.inchours());
        }
    }

    @Test
    public void testincday() {
        myClock t = new myClock();
        int actual = 1;
        for(int i = 0; i < 33; i++){
            actual+=1;
            if (actual>=32) actual = 1;
            if (actual == 0) actual = 1;
            assertEquals(actual,t.incDays());
        }
    }

    @Test
    public void testincmonth() {
        myClock t = new myClock();
        int actual = 1;
        for(int i = 0; i < 61; i++){
            actual+=1;
            if(actual>=13) actual=1;
            assertEquals(actual,t.incMonths());
        }
    }

    @Test
    public void testincyear() {
        myClock t = new myClock();
        int actual = 2000;
        for(int i = 0; i < 101; i++){
            actual+=1;
            if(actual>=2101) actual=2000;
            assertEquals(actual,t.incYears());
        }
    }

    @Test
    public void testout() {
        myClock t = new myClock();
        myClock.State state = myClock.State.normal;
        myClock.State1 state1 = myClock.State1.TIME;
        assertEquals("normal TIME 2000-1-1 0:0", t.Output(state, state1));
    }
}
