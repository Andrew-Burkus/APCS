import java.util.List;
import java.util.ArrayList;
public class IndexEntry {
	private String word;
	private ArrayList<Integer> numList;
	
	public IndexEntry(String word) {
		word.trim();
		this.word = word.toUpperCase();
		numList = new ArrayList<Integer>();
	}
	
	public void add(int num) {
		Integer Num = new Integer(num);
		if(!numList.contains(Num)) {
			numList.add(Num);
		}
	}
	
	public String getWord() {
		return word;
	}
	
	public String toString() {
		return word + " " + numList.toString();
	}
}