package pieelfortwitter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterException;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;


 
public class pieelStreams 
{	  
    public static void main(String[] args) throws TwitterException 
    {
    	TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
    	SearchScore searchscore = new SearchScore();
    	int count = 0;
    	
    	StatusListener listener = new StatusListener() {
    		@Override
    	    public void onStatus(Status status) {
    			if(isJap(status.getText()) == true)
    			{
    				User user = status.getUser();
    				  try
    				  {
    			            File file = new File("Tweets/tweetSample.txt");
    			            FileWriter fw = new FileWriter(file, true);
    			            fw.write("tweet"+count+":"+status.getText()+"\n");
    			            fw.write("score:"+searchscore.getFeelingScore(status.getText())+"\n");
    			            fw.write("\n");
    			            fw.close();

    			       } 
    				  catch(IOException e) 
    				  {
    					  System.out.println(e);
    			      }
    				System.out.println(status.getText());
    			}
    			
    		}
    		
    		 @Override
             public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                 System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
             }
             @Override
             public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                 System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
             }
             @Override
             public void onScrubGeo(long userId, long upToStatusId) {
                 System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
             }
             @Override
             public void onStallWarning(StallWarning warning) {
                 System.out.println("Got stall warning:" + warning);
             }
             @Override
             public void onException(Exception ex) {
                 ex.printStackTrace();
             }
             
    	};
    	
    	
    	twitterStream.addListener(listener);
    	twitterStream.sample();
    	
    	
    	//double[][] locations = {new double[]{129.5,28.4},new double[]{146.1,46.20}};
        //FilterQuery filter = new FilterQuery();	
        //filter.locations( locations );
       // twitterStream.filter( filter );

    	
    }
    
    
    //“ú–{‚ªŠÜ‚Ü‚ê‚Ä‚¢‚é‚©‚Ì”»’f
    public static boolean isJap(String str)
    {
    	for(int i = 0 ; i < str.length() ; i++) {
    		char ch = str.charAt(i);
    		Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(ch);
    		if (Character.UnicodeBlock.HIRAGANA.equals(unicodeBlock))
    			return true;

    		if (Character.UnicodeBlock.KATAKANA.equals(unicodeBlock))
    			return true;

    		if (Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS.equals(unicodeBlock))
    			return true;

    		if (Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS.equals(unicodeBlock))
    			return true;

    		if (Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION.equals(unicodeBlock))
    			return true;
    	}
    	return false;
    }
    
}
