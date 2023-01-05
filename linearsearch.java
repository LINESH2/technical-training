package javaaapp;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int arrSize=in.nextInt();
	String[] nameList=new String[arrSize];
	for(int index = 0;index <arrSize;index++)
		nameList[index]=in.nextLine();
	String searchName=in.nextLine();
	}

}