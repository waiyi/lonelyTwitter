package ca.ualberta.cs.lonelytwitter;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waiyi on 1/26/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }
    public int getCount(){
        tweets.size();
        return tweets.size();
    }
    public List<Tweet> getTweets(){
        List<Tweet> tweets = new ArrayList<Tweet>();
        return tweets;
    }

    public void removeTweet(Tweet tweet) {
    }
}
