package pieelfortwitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import twitter4j.TwitterException;

public class Main {

	public static void main(String[] args) throws IOException, TwitterException {
		SearchScore searchScore = new SearchScore();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("“ü—Í‘Ò‚¿>");
		String line = br.readLine();
		System.out.println(searchScore.getFeelingScore(line));
		br.close();
	}
}
