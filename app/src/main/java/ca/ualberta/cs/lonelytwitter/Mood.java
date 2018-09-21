package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    private Date curDate;

    public void getDate(Date date){
        this.curDate = date;

    }

    public abstract void moodtype();


}
