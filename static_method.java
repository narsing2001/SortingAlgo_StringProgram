package J12;

class test {
	static int a;
	static int b;
	static {
		a=10;
		System.out.println("value of the a="+a);
	}
	
	static {
		  b=20;
		System.out.println("value of the a="+b);
	}
	static int show(){
		System.out.println("inside show");
		return(20);
	}
	
}
interface calculate {
	public void area();
		
}


public class static_method {

	public static void main(String[] args) {	
		//System.out.println(test.a);
		test t1=new test();
		test t2=new test();
		test.show();

	}

}
