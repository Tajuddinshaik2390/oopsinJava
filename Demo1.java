package accessModifiers;

public class Demo1 {
	// instance variable
 protected int value=10;
 //constructor
	protected Demo1(){
		value=20;
	}
	//method
	protected void printValue() {
		System.out.println(value);
	}
	private void value() {
		System.out.println(value);
		
	}
	
	public static void main(String[] args) {
		
		
Demo1 d=new Demo1();
d.printValue();
d.value();
	}

}
