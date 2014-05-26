package util;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<String> t = new ArrayList<String>();
		t.add("1");
		t.add("2");
		for (String string : t) {
			t.remove(string);
		}
	}
}
