package javaaapp;

public class pat4 {
/*
 * 54321
 *  4321
 *   321
 *    21
 *     1
 */
	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		for(int r=n;r>=1;r--)
		{
			for(int c=1;c<=n-r;c++)
				System.out.print(" ");
			for(int c=r;c>=1;c--)
				System.out.print(c);
		System.out.println();
		}
	}
}

