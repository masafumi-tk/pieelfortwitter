package pieelfortwitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

import twitter4j.TwitterException;

public class Test {

	public static void main(String[] args) throws IOException, TwitterException {
		SearchScore searchscore= new SearchScore();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String,Double> tm= new TreeMap<String,Double>();
		tm.put("hogehoge", 1.234450413297);
		tm.put("gorigori", 0.423351098247);
		tm.put("a", 0.3554358190432);
		
		if(tm.containsKey("a")){
			System.out.println("yes");
			System.out.println(tm.get("a"));
			tm.put("a",tm.get("a")+1.0372006666666667);
		}
		else
			System.out.println("no");
		
		System.out.println("ŒãF"+tm.get("a"));
		
		System.out.println("“ü—Í‘Ò‚¿>");
		String line = br.readLine();
		System.out.println(searchscore. getFeelingScore(line)-1);
		br.close();
	}
}
