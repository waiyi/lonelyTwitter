package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by waiyi on 1/12/16.
 */
public class CryingBaby extends Mood{
    public CryingBaby(Date date) {
        super(date);
    }

    @Override
    public String feeling(String message) {
        return message + " Mommy :'( ";
    }
}
