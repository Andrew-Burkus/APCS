import java.util.Scanner;
class Pascal {
	public int [][] pascalTriangle(int N) {
		int[][] pascal = new int [N+1][];

		pascal [1] = new int[3];
		pascal [1][1] = 1;
			
		for(int i = 2; i <= N; i++) {
			pascal[i] = new int [i + 2];
			for(int k = 1; k < pascal[i].length - 1; k++) 
				pascal [i][k] = pascal [i-1][k-1] + pascal[i-1][k];
		}
		
		return pascal;
}
	
	public static void main(String[] args) {
		Pascal P = new Pascal();
		Scanner Sc = new Scanner(System.in);
		int x = Sc.nextInt();
		int [][] pascal;
		pascal = P.pascalTriangle(x).clone();
		
		for(int i = 1; i < pascal.length; i++) {
			for(int j = 1; j < pascal[i].length - 1; j++) {
				System.out.print(pascal[i][j]);
			}
			System.out.println();
		}
	}
}