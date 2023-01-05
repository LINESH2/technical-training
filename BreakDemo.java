package javaaapp;

public class BreakDemo {

	public static void main(String[] args) {
		//for(int i=1;i<=10;i++)
	//	{
	//		if(i%4==0)break;
	//		System.out.println(i);
	//	}
		for(int j=1;j<=5;j++)
		{
			for(int i=1;i<=10;i++) 
			{
				if(i%4==0)break;
				System.out.println(i);
			}
		}
	}
}
