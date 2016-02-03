package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.Date;
import java.util.List;

/**
 * Created by waiyi on 1/26/16.
 */
public class Lab4ExerciseTest extends ActivityInstrumentationTestCase2 {
    public Lab4ExerciseTest(){
        super(Lab4ExerciseTest.class);
    }


    public void testAddTweet() {
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        try {
            tweets.add(tweet);
            tweets.add(tweet);
            assertFalse(tweets.hasTweet(tweet));
        } catch (Exception e){
            assertTrue(true);
        }
        fail();
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Tweet tweet1 = new NormalTweet(new Date(1), "Test tweet 1");
        Tweet tweet2 = new NormalTweet(new Date(2), "Test tweet 2");
        Tweet tweet3 = new NormalTweet(new Date(3), "Test tweet 3");

        tweets.add(tweet1);
        tweets.add(tweet2);
        tweets.add(tweet3);

        List<Tweet> returnedTweets = tweets.getTweets();

        assertTrue(returnedTweets.get(0).getDate().before
                (returnedTweets.get(1).getDate()));
        assertTrue(returnedTweets.get(1).getDate().
                before(returnedTweets.get(2).getDate()) );

    }
    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);

        assertTrue(tweets.hasTweet(tweet));
    }

    public void testRemoveTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        tweets.removeTweet(tweet);

        assertFalse(tweets.hasTweet(tweet));

    }

    public void testGetCount(){
        int counter = 0;
        TweetList tweets = new TweetList();

        assertEquals(counter, tweets.getCount());

        Tweet tweet = new NormalTweet("Test tweet");

        tweets.add(tweet);
        tweets.add(tweet);
        tweets.add(tweet);

        counter = 3;

       // int returnedCount = tweets.getCount();

        assertEquals(counter, tweets.getCount());
    }
}


