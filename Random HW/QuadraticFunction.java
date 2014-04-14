import java.util.Comparable;
public class QuadraticFunction implements Comparable<QuadraticFunction> {
	private int a,
				b,
				c;
	private String function;

	public QuadraticFunction(int a, int b, c) {
		a = a;
		b = b;
		c = c;
		function = a + "x^2 " + b + "x " + c;
	}

	public double valueAt(double x) {
		return a * (Math.pow(x, 2)) + b * x + c;
	}

	public String toString() {
		return function;
	}

	public boolean equals(Object other) {
		if(other != null)
			return ((QuadraticFucntion) other).a == this.a && ((QuadraticFucntion) other).b == this.a && ((QuadraticFucntion) other).c == this.b;
		else
			return false;
	}

	public int compareTo(QuadraticFucntion other) {
		if(other.a == this.a) {
			if(other.b == this.b) {
				if(other.c == this.c) {
					return 0;
				}
				else {
					return compare(this.c. other.c);
				}
			}
			else {
				return compare(this.b, other.b);
			}
		}
		else {
			return compare(this.a, other.a);
		}
	}
	
}