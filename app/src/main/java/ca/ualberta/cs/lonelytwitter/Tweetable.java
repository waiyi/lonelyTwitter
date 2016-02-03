package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by romansky on 1/12/16.
 */

/**
 * Tweetable is the interface with getMessage and getDate
 */
public interface
        Tweetable {
    // getMessage returns the tweet message.
    public String getMessage();
    public Date getDate();
}
