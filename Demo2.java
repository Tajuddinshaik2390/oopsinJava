package accessModifiers;
public class Demo2 extends Demo1{
	public static void main(String args[]) {
		Demo1 d=new Demo1();
		d.printValue();
		System.out.println(d.value);
	}
	void test() {
		System.out.println(value);
		printValue();
	}
	
	
}
