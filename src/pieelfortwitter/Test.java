package pieelfortwitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.TwitterException;

public class Test {

	public static void main(String[] args) throws IOException, TwitterException {
		SearchScore searchscore= new SearchScore();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("“ü—Í‘Ò‚¿>");
		String line = br.readLine();
		System.out.println(searchscore. getFeelingScore(line)-1);
		br.close();
	}
}
