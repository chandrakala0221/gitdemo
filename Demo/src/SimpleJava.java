
public class SimpleJava {
	
	int i = 20; 
	
	int j = 10; //initialization
	
	void fun1(){
		
		System.out.println("This is fun1");
		System.out.println("This is fun1");
		
	}
	
	int fun2(){
		
		int f1 = 30;
		
		return f1;
		
	}
	
	void fun3(int a){
		
		System.out.println("fun3 a: "+a);
	}
	
	int fun4(int a, int b){
		
		int c = a+b;
		
		return c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1 = 100;
		
		SimpleJava obj1 = new SimpleJava();
		
		System.out.println(obj1.i);
		
		System.out.println(obj1.j);
		
		System.out.println(i1);
		
		obj1.fun1();
		
		int fo  = obj1.fun2();
		
		System.out.println(fo);
		
		obj1.fun3(40);
		
		int fo2 = obj1.fun4(50, 60);
		
		System.out.println(fo2);
		
		System.out.println(fo2);
		
	
		
	}

}
