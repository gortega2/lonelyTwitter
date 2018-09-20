package ca.ualberta.cs.lonelytwitter;

/**
 * Created by gortega on 9/19/18.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return false;
    }
}
