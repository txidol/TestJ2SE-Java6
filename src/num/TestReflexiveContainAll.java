package num;

import java.util.Arrays;
import java.util.List;

public class TestReflexiveContainAll {
	
	public static void main(String[] args) {
		List<String> simpleResultCode = Arrays.asList("01","02","03");
		List<String> simpleBetDetail = Arrays.asList("01","02");
		System.out.println(reflexiveContainAll(simpleResultCode, simpleBetDetail));
		List<String> simpleResultCode1 = Arrays.asList("01","04","03");
		List<String> simpleBetDetail1 = Arrays.asList("01","02");
		System.out.println(reflexiveContainAll(simpleResultCode1, simpleBetDetail1));
	}
	
	
	private static boolean reflexiveContainAll(List<String> code, List<String> compareCode){
		boolean isAllHave;
		if (code.size() > compareCode.size()) {
			isAllHave = code.containsAll(compareCode);
		} else {
			isAllHave = compareCode.containsAll(code);
		}
		return isAllHave;
	}
}
