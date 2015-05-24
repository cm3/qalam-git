/* penghuninya -> huni */

import org.apache.lucene.analysis.id.IndonesianAnalyzer;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.Query;

public class Test3 {
	static String stemTerm(String term) throws org.apache.lucene.queryparser.classic.ParseException {
		IndonesianAnalyzer id_an = new IndonesianAnalyzer();
		QueryParser parser = new QueryParser("field", id_an);
		Query query = parser.parse(term);
		return query.toString("field");
	}
	public static void main(String args[]) throws org.apache.lucene.queryparser.classic.ParseException {
		System.out.println(args[0] + " -> " + stemTerm(args[0]));
	}
}
