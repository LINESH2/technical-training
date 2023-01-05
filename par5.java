package javaaapp;

public class par5 {

	public static void main(String[] args) {
		int n=new java.util.Scanner(System.in).nextInt();
		for(int r=n;r>=1;r--){
			for(int c=1;c<=r;c++)
				System.out.print(char)(c+64));
			for(int c=1;c<=(n-r)*2;c++)
				System.out.print(" ");
			for(int c=r;c>=1;c--)
				System.out.print(c);
			System.out.println();
		}
		for(int r=n;r>=1;r--){
			for(int c=1;c<=r;c++)
				System.out.print(c);
			for(int c=1;c<=(n-r)*2;c++)
				System.out.print(" ");
			for(int c=r;c>=1;c--)
				System.out.print(c);
			System.out.println();
		}
	}
}
