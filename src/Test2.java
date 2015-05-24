/* amenities -> amen */

import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;

public class Test2 {
	static String stemTerm(String term) throws org.apache.lucene.queryparser.classic.ParseException {
		EnglishAnalyzer en_an = new EnglishAnalyzer();
		QueryParser parser = new QueryParser("field", en_an);
		Query query = parser.parse(term);
		return query.toString("field");
	}
	public static void main(String args[]) throws org.apache.lucene.queryparser.classic.ParseException {
		System.out.println(args[0] + " -> " + stemTerm(args[0]));
	}
}
