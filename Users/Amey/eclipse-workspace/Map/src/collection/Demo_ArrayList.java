package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_ArrayList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add(" List1 ");
		list.add(" List2 ");
		list.add(" List3 ");
		list.add(" List4 ");
		list.add(" List5 ");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (String getList : list) {
			System.out.println(" Required List is " + getList);
		}
	}

}
