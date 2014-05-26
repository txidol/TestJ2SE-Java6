package param;

public class Test {
	void test(Demo d){
		d.a ="4";
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.a = "123";
		Test t = new Test(); 
		t.test(d);
		System.out.println(d.a);
		
		Demo d1 = new Demo();
		d1 = null;
		Test t1 = new Test(); 
		t1.test1(d1);
		System.out.println(d1.a);
	}
	
	void test1(Demo d){
		if(d==null){
			d = new Demo();
		}
	}

}
