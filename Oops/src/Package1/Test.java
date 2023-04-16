package Package1;

class Test
{
	
	public static void main(String[] args) 
	{
		MyClass mc = new MyClass();
		mc.setAge(23);

		System.out.println("Hello "+mc.getAge());
		
		MyClass t1 = new MyClass();
		t1.setAge(34);

		System.out.println("Hello "+t1.getAge());
		
		System.out.println("Area "+t1.Area(7));	
		
		System.out.println("Team "+t1.team);
	}
}
