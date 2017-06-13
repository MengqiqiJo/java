
public class CTriangle extends CShape{

	private int a = 1;	// side must be positive
	private int b = 1;	// side must be positive
	private int c = 1;	// side must be positive

	public CTriangle(int a, int b , int c)
	{	
		shapename = "triangle";
		if(isCanBeTriangle(a,b,c))
		{
			setA(a);
			setB(b);
			setC(c);
		}
	}
	
	private void setA(int a)
	{
		this.a = a;
	}

	private void setB(int b)
	{
		this.b = b;
	}
	
	private void setC(int c)
	{
		this.c = c;
	}
	// todo: code the get methods
	
	// internal method (utility method) to store the rule for a valid side
	private boolean isValidPositive(int n)
	{
		return (n>0);
	}
	
	private boolean isCanBeTriangle(int x,int y,int z)
	{
		double a = x;
		double b = y;
		double c = z;
		return (isValidPositive(x)&&isValidPositive(y)&&isValidPositive(z)&&((a+b)>c)&&((a+c)>b)&&((b+c)>a)&&(Math.abs(a-b)<c)&&(Math.abs(a-c)<b)&&(Math.abs(b-c)<a));
	}
	
	@Override
	protected double CalculateArea() {
		// TODO Auto-generated method stub
		double a = this.a;
		double b = this.b;
		double c = this.c;
		double p=(a+b+c)/2;
		double m = p*(p-a)*(p-b)*(p-c);
		return Math.sqrt(m);
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}

}
