class FloatConversion_1	{

	public static void main(String args[])	{
	
		int i = 44;
		float f = 98.42f;
		double d = 103.67;
		
		f = (float) i;
		d = (double) f;
		i = (int) d;
		
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		
	}
}