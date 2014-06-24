package com.ty.java.testcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Filter {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Rod");
		list.add("Neeta");
		list.add("Eric");
		list.add("Missy");
		Filter filter = new Filter();
		List shorts = filter.filterLongerThan(list, 4);
		System.out.println(shorts.size());
		Iterator iter = shorts.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public List filterLongerThan(List list, int length) {
		List result = new ArrayList();
		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			String item = (String) iter.next();
			if (item.length() <= length) {
				result.add(item);
			}
		}
		return result;
	}
}
