package studio7;

public class Rectangle {

	private double length;
	private double width;
	private boolean isSquare;
	
	public Rectangle(double a, double b)
	{
		length = a;
		width = b;
		if (length==width)
		{
			isSquare=true;
		}
		else
		{
			isSquare=false;
		}
	}
	public double Area()
	{
		double Area = length*width;
		return Area;
	}
	public double Perimeter()
	{
		double Perimeter = 2*length+2*width;
		return Perimeter;
	}
	public boolean CompareAreas(Rectangle a)
	{
		
		if (a.Area()<this.Area())
		{
			return true;
		}
		else
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
