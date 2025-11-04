package J12;

public class Wrapper {

	public static void main(String[] args) {
		
		int x=Integer.parseInt("123");
		System.out.println(x);
	    System.out.println("1....................................................................");
		
		Integer x1=Integer.valueOf("1001");
	    int y=x1.intValue();
	    System.out.println(y);
	    System.out.println("2....................................................................");
		
	    
		Double w=Double.parseDouble("200");
		System.out.println(w);
		System.out.println("3....................................................................");
		
		Double a1=Double.valueOf("30283738474847");
		double a=a1.doubleValue();
		System.out.println(a);	   
		System.out.println("4...................................................................");
		
		Float b1=Float.valueOf("302837384");
		float b=b1.floatValue();
		System.out.println(b);
		System.out.println("5...................................................................");
		
        
        float w1=Float.parseFloat("999");
		System.out.println(w1);   
	    System.out.println("6..................................................................");
		
        boolean m=Boolean.parseBoolean("True");
		System.out.println(m);    
		System.out.println("7.................................................................");
			
		boolean n=Boolean.parseBoolean("yes");
		System.out.println(n);    	
		
}
		
}
	
