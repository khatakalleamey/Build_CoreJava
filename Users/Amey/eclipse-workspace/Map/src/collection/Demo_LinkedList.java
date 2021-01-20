package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo_LinkedList {

	public static void main(String[] args) {

		LinkedList<Object> LNKDList = new LinkedList<Object>();

		LNKDList.add("LList1");
		LNKDList.add("LList2");
		LNKDList.add("LList3");
		LNKDList.add("LList4");
		LNKDList.add("LList5");

		Iterator<Object> itr = LNKDList.descendingIterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-------------------------------------------------------------------------");

		for (Object getLList : LNKDList) {
			System.out.println(" Required LinkedList is " + getLList);
		}
	}

}
