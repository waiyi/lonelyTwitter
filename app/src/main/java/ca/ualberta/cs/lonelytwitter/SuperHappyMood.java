package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by waiyi on 1/12/16.
 */

/**
 * @author waiyi
 * @return  * SuperHappyMood is a mood return message with "Super Awesome :D"
 */
public class SuperHappyMood extends Mood {
    public SuperHappyMood(Date date) {
        super(date);
    }

    @Override
    public String feeling(String message) {
        return  message + " Super Awesome :D";

    }
}
