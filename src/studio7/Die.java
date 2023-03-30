package studio7;

public class Die {
	private int sides;
	public Die(int a) {
		sides=a;
	}
	public int roll() {
		return (int)(Math.random()*sides+1);
	}
	public static void main(String args[]) {
		Die x = new Die(6);
		int rolled=x.roll();
		System.out.println(rolled);
	}
}
