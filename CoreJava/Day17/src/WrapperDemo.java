
public class WrapperDemo {

	public void test() {
		Integer a1 = new Integer(100);
		Integer a2 = new Integer("200");
		System.out.println(Integer.MAX_VALUE);
	}
	
	public static void main(String[] args) {
		WrapperDemo wd = new WrapperDemo();
		wd.test();
	}
}
