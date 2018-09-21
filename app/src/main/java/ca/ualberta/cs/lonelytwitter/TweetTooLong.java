package ca.ualberta.cs.lonelytwitter;

public class TweetTooLong extends Exception {

    TweetTooLong(){
        super("The message is too long. The character limit is 140.");
    }
}
