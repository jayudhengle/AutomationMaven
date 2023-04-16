package Dev;

import Package1.*;

public class DevClass extends MyClass
{

	public static void main(String[] args) 
	{
		MyClass mc = new MyClass();
		float val = mc.Area(23);
		System.out.println(val);
	}

}
