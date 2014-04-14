public class QuadraticComparator implements Comparator<QuadraticFunction> {
	private double x;
	public QuadraticComparator() { x = 0 }
	public QuadraticComparator(double x) { x = x }

	public int compare(QuadraticFunction A, QuadraticFunction B) {
		if(A != null && B != null)
			return A.valueAt(x) - B.valueAt(x);
	}
}