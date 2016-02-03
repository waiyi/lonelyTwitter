package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */

/**
 * NormalTweet extends Tweet as well as implements Tweetable
 */
public class NormalTweet extends Tweet implements Tweetable {
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    public NormalTweet(String message) {
        super(message);
    }

    public Date getDate() {
        return this.date;
    }

    public String getMessage() {
        return this.message;
    }
    //isImportant

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
