package collectionWithGenerics.treeSet;

import java.util.Set;
import java.util.TreeSet;

public class StringTreeSet
{
	public static void main(String[] args) {
		

		Set<String>set=new TreeSet<>();

		set.add("abc");
		set.add("xyz");
		set.add("phk");

		for(String obj:set)
		{
			System.out.println(obj);
		}
	}
}