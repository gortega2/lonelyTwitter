package ca.ualberta.cs.lonelytwitter;

/**
 * Created by gortega on 9/19/18.
 */

public class ImportantTweet extends Tweet {

    ImportantTweet(){
        super();
    }

    public ImportantTweet(String message){
        super(message);
    }
    @Override
    public Boolean isImportant(){
        return true;
    }
}
