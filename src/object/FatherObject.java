package object;

public class FatherObject {
	
	public void test(){
		otherTest();
		System.out.println("father test");
	}
	
	public void otherTest(){
		System.out.println("father otherTest");
	}
	
}
