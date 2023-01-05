package javaaapp;

import java.util.Scanner;

public class posOrNeg {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		char cont;
		do{
			int n=new java.util.Scanner(System.in).nextInt();
			if(n>0)
				System.out.println("+ve");
			else if(n<0)
				System.out.println("-ve");
			else
				System.out.println("zero");
			System.out.println("want to check more[Y]es/[N]o ?");
			cont=in.next().charAt(0);
		}
		while(cont=='Y'||cont=='y');
	}
}
