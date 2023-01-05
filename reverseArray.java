package javaaapp;
import java.util.Scanner;
public class reverseArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int arrSize=in.nextInt();
		int[] arr=new int[arrSize];
		for(int index=0;index<arrSize;index++)
			arr[index]=in.nextInt();
		for(int i=0,j=arrSize-1;i<arrSize/2;i++,j--)
			arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
		for(int index=0;index<arrSize;index++)
			System.out.println(arr[index]);

	}

}
