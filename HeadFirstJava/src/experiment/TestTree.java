package experiment;

import java.util.Set;
import java.util.TreeSet;

public class TestTree {

	public static void main(String[] args) {
		TestTree tt = new TestTree();
		tt.go();

	}
	
	public void go()
	{
		Book b1 = new Book("How Cats Work");
		Book b2 = new Book("Remix your body");
		Book b3 = new Book("Finding EMO");
		
		TreeSet<Book> tree = new TreeSet<Book>();
		
		tree.add(b1);
		tree.add(b2);
		tree.add(b3);
		
		System.out.println(tree);
		
	}

}

class Book implements Comparable<Book>
{
	String title;
	public Book(String title)
	{
		this.title = title;
	}
	@Override
	public int compareTo(Book o) {
		return title.compareToIgnoreCase(o.title);
	}
	
	@Override
	public String toString() {
		return title;
	}
}