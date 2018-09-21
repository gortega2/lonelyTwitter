package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {

    private Date curDate;
    private String message;
    private int MAX_CHARS = 140;

    Tweet(){
        this.curDate = new Date();
        this.message = "Defualt message.";
    }

    Tweet(String message){
        this.curDate = new Date();
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }

    public Date getDate(){
        return this.curDate;
    }

    public void setMessage(String message) throws TweetTooLong{
        if (message.length() <= MAX_CHARS){
            this.message = message;
        } else {
            throw new TweetTooLong();
        }

    }

    public abstract Boolean isImportant();
}
