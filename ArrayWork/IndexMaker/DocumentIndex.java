import java.util.List;
import java.util.ArrayList;
public class DocumentIndex extends ArrayList<IndexEntry> {
	public DocumentIndex() {
		super(10);
	}
	
	public DocumentIndex(int capacity) {
		super(capacity);
	}
	
	public void addWord(String word, int num) {
		word.trim();
		for(int i = 0; i < super.size(); i++) { //iterate through array, find word
			if(super.get(i).getWord().equalsIgnoreCase(word)) {
				super.get(i).add(num);
				return;//if found exit function
			}	
		}
		
		IndexEntry W = new IndexEntry(word);
		W.add(num);
		int pos = super.size();
		
		for(int i = 0; i < super.size(); i++) {
			if(W.getWord().compareToIgnoreCase(super.get(i).getWord()) < 0) {
				pos = i;
				break;
			}
			super.add(pos, W);
		}
	}
	
	public void addAllWords(String str, int num) {
		str.trim();
		for(String word : str.split("\\W+")) {
			addWord(word, num);
		}
	}
}