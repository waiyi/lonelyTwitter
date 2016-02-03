package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by waiyi on 1/12/16.
 */

/**
 * Mood is an abstract class  for Date and Mood with getter and setter and abstract String feeling
 */
public abstract class Mood {
    protected Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Mood() {
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String feeling (String message);

}
