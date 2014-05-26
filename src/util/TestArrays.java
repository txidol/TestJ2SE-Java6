package util;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestArrays {

	@Test
	public void testUserArraysChangeArraytoList() {
		// ��Arrays
		// public static <T> List<T> asList(T... a) 
		// Returns a fixed-size list backed by the specified array

		List<Integer> testList = Arrays.asList(1, 2, 3);
		assertEquals("���ɴ�СΪ3��List", 3, testList.size());

		List<Integer> testList1 = Arrays.asList(1, 2);
		assertEquals("���ɴ�СΪ2��List", 2, testList1.size());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void isFixedList() {
		// ��Arrays
		// public static <T> List<T> asList(T... a) 
		// Returns a fixed-size list backed by the specified array
		Integer[] test = {1,2,3};
		List<Integer> testList = Arrays.asList(test);
		assertEquals("���ɴ�СΪ3��List", 3, testList.size());
		testList.add(4);//throw UnsupportedOperationException
	}
	
	@Test
	public void testSort() {
		// ��Arrays
		// void java.util.Arrays.sort(Object[] a)
		// ����
		Integer[] test = {3,2,1};
		Arrays.sort(test);
		assertEquals( 1, test[0].intValue() );

	}
	
	@Test
	public void testEquals() {	
		Integer[] test1 = {3,2,1};
		Integer[] test2 = {3,2,1};	
		Integer[] test3 = {1,2,3};	
		
		//equals
		assertTrue(Arrays.equals(test1, test2));
		assertFalse(Arrays.equals(test1, test3));
		
		//toString
		assertEquals( "[3, 2, 1]", Arrays.toString(test1) );
		
		//copyOf
		assertEquals( "[3, 2]", Arrays.toString(Arrays.copyOf(test1, 2)) );
		
		//fill
		Arrays.fill(test1, 2);
		assertEquals( "[2, 2, 2]", Arrays.toString(test1) );
	}
}
