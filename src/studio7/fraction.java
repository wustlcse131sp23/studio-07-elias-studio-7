package studio7;

public class fraction 
{
private int numerator;
private int denominator;
 
public fraction(int a, int b)
{
	numerator=a;
	denominator=b;
	
}
public fraction add(fraction x)
{
	int a=this.numerator;
	int b=this.denominator;
	int c=x.numerator;
	int d=x.denominator;
	fraction y = new fraction((a*d)+(b*c),(b*d));
	return y;
}
public fraction mutliply(fraction x)
{
	int a=this.numerator;
	int b=this.denominator;
	int c=x.numerator;
	int d=x.denominator;
	fraction e= new fraction((a*c),(b*d));
	return e;
}
public String toString()
{
	int x =this.numerator;
	int y =this.denominator;
	String z=x+"/"+y;
	return z;
}
public static void main(String[] args)
{
	fraction p= new fraction( 4,5);
	fraction i= new fraction (6,7);
	System.out.println("Adding Fraction"+" " + p.add(i));
	System.out.println("Mutiplying Fractions"+" "+ p.mutliply(i));
}
}
