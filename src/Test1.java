/* penghuninya -> 4 (length of 'huni')*/

import org.apache.lucene.analysis.id.IndonesianStemmer;

public class Test1 {
	static String stemTerm(String term) {
		IndonesianStemmer stemmer = new IndonesianStemmer();
		return String.valueOf(stemmer.stem(term.toCharArray(), term.length(),
				true));
	}
	public static void main(String args[]) {
		System.out.println(args[0] + " -> " + stemTerm(args[0]));
	}
}
