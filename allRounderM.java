import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.*;

public class allRounderM {

	public static void main(String[] args) throws IOException{
		
		Document doc = Jsoup.connect("https://www.allrounderm.com/cardio-workout-for-fat-loss/").get();
		
		for(Element row : doc.select("figure.wp-block-table.alignwide.is-style-stripes tr")) {
			
			String time = row.select("td.has-text-align-center:nth-of-type(1)").text();
			String exercise = row.select("td.has-text-align-center:nth-of-type(2)").text();
			
			System.out.println(time + "   " + exercise);
		}
	}
}