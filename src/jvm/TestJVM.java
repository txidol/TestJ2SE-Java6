package jvm;

import java.util.ArrayList;
import java.util.List;

public class TestJVM {

	//In Eclipse add the -XX:+HeapDumpOnOutOfMemoryError to the runtime configuration.
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		while (1 < 2) {
			list.add("OutOfMemoryError soon");
		}

	}
}
