package num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestZhuhe {
	public static void main(String[] args) {
		List<String> simpleResultCode = Arrays.asList("01","02");
		System.out.println(getCombinations(simpleResultCode, 2));
	}

	/** 
	* @Title: getCombinations 
	* @Description: ��ȡͶע����λͶע�������е���� 
	* @param betNumbers Ͷע���ݼ���
	* @param length ��ϳ���
	* @return
	*/
	public static List<String> getCombinations(List<String> betNumbers, int length) {
		ArrayList<Object> list = new ArrayList<Object>();
		for (String betNumber : betNumbers) {
			list.add(betNumber);
		}
		List<List<Object>> result = new ArrayList<List<Object>>();
		List<String> combinations = new ArrayList<String>();
		long n = (long) Math.pow(2, list.size());
		List<Object> combine;
		for (long l = 0L; l < n; l++) {
			combine = new ArrayList<Object>();
			for (int i = 0; i < list.size(); i++) {
				if ((l >>> i & 1) == 1) {
					combine.add(list.get(i));
				}
			}
			if (combine.size() == length) {
				result.add(combine);
			}
		}
		for (List<Object> aa : result) {
			Object[] o = aa.toArray();
			String tmp = "";
			for (int i = 0; i < o.length; i++) {

				tmp += o[i];
				if (i != o.length - 1) {
					tmp += ",";
				}
			}
			combinations.add(tmp);
		}

		return combinations;
	}
}
