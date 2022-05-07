public class myClock {
    

    enum State1 {

        day,
        month,
        yer,
        alarm,
        chime,
        TIME,
        DATE,
        minuits,
        hours
        
    }
    enum State {
        normal,
        alarmset,
        updateset
    }
    int m = 0, h = 0, D = 1, M = 1, Y = 2000;

    String outstate;
    String outtime;
    String outdate;

    public String modifyState(String in) {

        State state = State.normal;
        State1 state1 = State1.TIME;
        char[] inString = in.toCharArray();

        for (char input : inString) {
            switch (state) {
                case normal:
                    if (input == 'c') {
                        state = State.updateset;
                        state1= State1.minuits;
                    } else if (input == 'b') {
                        state = State.alarmset;
                        state1 = State1.alarm;
                    } else if (input == 'a') {
                        if (state1 == State1.TIME) state1 = state1.DATE;
                        else
                            state1 = state1.TIME;
                    }
                    break;
                case alarmset:
                    if(input == 'a' && state1 == State1.alarm){
                        state1 = State1.chime;
                    }
                    else if(input == 'd'){
                        state = State.normal;
                        state1 = State1.TIME;
                    }
                    break;
                case updateset:
                    if (input == 'a'){
                        if(state1 == State1.minuits){
                            state1 = State1.hours;
                        }
                        else if(state1 == State1.hours){
                            state1 = State1.day;
                        }
                        else if(state1 == State1.day){
                            state1 = State1.month;
                        }
                        else if(state1 == State1.month){
                            state1 = State1.yer;
                        }
                        else{
                            state = State.normal;
                            state1 = State1.TIME;
                        }
                    }
                    else if(input == 'd'){
                        state = State.normal;
                        state1 = State1.TIME;
                    }
                    else if(input == 'b'){
                        if(state1 == State1.minuits){
                            incminits();
                        }
                        else if(state1 == State1.hours){
                            inchours();
                        }
                        else if(state1 == State1.day){
                            incDays();
                        }
                        else if(state1 == State1.month){
                            incMonths();
                        }
                        else if(state1 == State1.yer){
                            incYears();
                        }
                    }


            }
            Output(state, state1);
        }
        Display();
        String output = outstate + " " + outdate + " " + outtime;
        return output;
    }
    public String Output(State state, State1 state1){
        outstate = state.name() + " " + state1.name();
        outdate = Y + "-" + M + "-" + D;
        outtime = h + ":" + m;
        String output = outstate + " " + outdate + " " + outtime;
        return output;
    }
    public int incminits(){
        m+=1;
        if(m==60){
            inchours();
            m=0;
        }
        return m;
    }
    public int inchours(){
        h+=1;
        if(h==24){
            incDays();
            h=0;
        }
        return h;
    }
    public int incDays(){
        D+=1;
        if(D==32){
            incMonths();
            D=1;
        }
        return D;
    }
    public int incMonths(){
        M+=1;
        if(M==13){
            incYears();
            M=1;
        }
        return M;
    }
    public int incYears(){
        Y+=1;
        if(Y==2101){
            Y=2000;
        }
        return Y;
    }



    public void Display(){
        System.out.println(outstate);
        System.out.println(outdate);
        System.out.println(outtime);
    }

}