package solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class FlatteningIterator implements Iterator<String>{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		l1.add("a"); 
		l1.add("b");
		l1.add("c");
		
		List<String> l2 = new ArrayList<String>();
		l2.add("d");
		l2.add("e");
		
		List<String> l3 = new ArrayList<String>();
		l3.add("f");
		l3.add("g");

		
		List<Iterator<String>> iterators = new ArrayList<Iterator<String>>();
		iterators.add(l1.iterator());
		iterators.add(l2.iterator());
		iterators.add(l3.iterator());
		
		FlatteningIterator fIterator = new FlatteningIterator(iterators.iterator());
		while (fIterator.hasNext()) {
			System.out.print(fIterator.next() + " ");
		}
	}
	
	private List<Iterator<String>> iterators = null;
	private boolean hasMoreElements = false;;
	private int currentItIndex = 0;
	
	public FlatteningIterator(Iterator<Iterator<String>> input) {
		iterators = new ArrayList<Iterator<String>>();
		while (input.hasNext()) {
			iterators.add(input.next());
		}
		if (iterators.size() > 0)
			hasMoreElements = true;
	}
	
	@Override
	public String next() {
		if (!hasMoreElements)
			return null;
		int iteratorsSize = iterators.size();
		String str = iterators.get(currentItIndex % iteratorsSize).next();
		
		currentItIndex++;
		int increment = 1;
		while (!iterators.get(currentItIndex % iteratorsSize).hasNext()) {
			increment++;
			currentItIndex++;
			if (increment >= iteratorsSize) {
				hasMoreElements = false;
				break;
			}
		}
		
		return str;
	}
	
	@Override
	public boolean hasNext() {
		return hasMoreElements;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

}
