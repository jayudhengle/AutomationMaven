package Package1;

public class MyClass 
{

	private int age;
	String name = "Jayu";
	private float area;
	public String team ="QA";
	
	private float pi = (22/7);
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public float Area(int radius) 
	{
		area = (float) (pi * radius* radius);		
		return(area);
	}
		
}


