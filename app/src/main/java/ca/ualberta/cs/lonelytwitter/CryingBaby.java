package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by waiyi on 1/12/16.
 */

/**
 * CryingBaby extends from Mood to
 * @author waiyi
 * @return return message with "Mommy :'("
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
