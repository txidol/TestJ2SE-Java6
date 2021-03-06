package util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class TestCollections {

	@Test
	public void testSort() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
		assertEquals(3, demoList.get(0).intValue());

		//public static <T extends Comparable<? super T>> void sort(List<T> list)
		Collections.sort(demoList);

		assertEquals(1, demoList.get(0).intValue());

		//public static void shuffle(List<?> list) // 随机排序
		//public static void reverse(List<?> list) // 反序		  
	}

	@Test
	public void testBinarySearch() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
		//必须先排序
		Collections.sort(demoList);
		assertEquals(1, demoList.get(0).intValue());

		//二分查找位置
		//public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key)
		assertEquals(0, Collections.binarySearch(demoList, 1));

		//public static int indexOfSubList(List<?> source, List<?> target)
		// public static int lastIndexOfSubList(List<?> source, List<?> target)
	}

	@Test
	public void testSwap() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));

		//public static void swap(List<?> list, int i, int j)
		Collections.swap(demoList, 0, 2);
		assertEquals(1, demoList.get(0).intValue());
		//public static void rotate(List<?> list, int distance)  //指定距离轮换
		//public static <T> boolean replaceAll(List<T> list, T oldVal, T newVal)  //指定替换
	}

	@Test
	public void testCopy() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));

		//public static <T> void copy(List<? super T> dest, List<? extends T> src)
		//注意目的List的size最少要等于src的size
		List<Integer> copyList = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		Collections.copy(copyList, demoList);
		assertEquals(3, copyList.size());
		assertEquals(3, copyList.get(0).intValue());

		copyList.add(4);
		assertEquals(3, demoList.size());
	}

	@Test
	public void testCompary() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));
		assertEquals(1, Collections.min(demoList).intValue());
		assertEquals(3, Collections.max(demoList).intValue());

		List<Integer> compareList = new ArrayList<Integer>(Arrays.asList(5, 6, 7));
		//Returns true if the two specified collections have no elements in common
		assertTrue(Collections.disjoint(demoList, compareList));
	}

	@SuppressWarnings("unused")
	@Test
	public void testCreate() {
		List<Integer> demoList = new ArrayList<Integer>(Arrays.asList(3, 2, 1));

		//空对象	size=0  无添加方法
		List<Integer> emptyList = Collections.emptyList();

		//返回一个只包含指定对象的不可变列表。
		List<Integer> singletonList = Collections.singletonList(1);

		//返回指定列表的一个动态类型安全视图。
		List<Integer> checkedList = Collections.checkedList(demoList, Integer.class);

		//返回指定列表的不可修改视图。
		List<Integer> unmodifiableList = Collections.unmodifiableList(demoList);

		//返回指定列表支持的同步（线程安全的）列表。
		List<Integer> synchronizedList = Collections.synchronizedList(demoList);

		synchronized (synchronizedList) {
			Iterator<Integer> i = synchronizedList.iterator(); // Must be in synchronized block
			while (i.hasNext())
				i.next();
		}

		//map set sortedMap sortedSet
	}
}
