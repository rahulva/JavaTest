package com.test.interview;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.List;

public class Self {
	List<String> vals = new ArrayList<String>();

	public void put(String item) {
		if (item != null && !item.isEmpty()) {
			this.vals.add(item);
		}
	}

	public boolean take(String item) {
		if (vals.contains(item)) {
			vals.remove(item);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

	}

	public void shelfDoNothingForNull() {
		Self shelf = new Self();
		shelf.put(null);
//	        Assert.assertTrue(shelf.take("Orange"));
		assert shelf.take(null);
	}
}
