import java.util.Random;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Random rand = new Random();
		System.out.println("n = ");
		int n = scan.nextInt();
		int[]arr1 = new int[n];
		int[]arr2 = new int[arr1.length];
		int[]arr3 = new int[arr1.length];
		for(int x=0;x<n;x++)
		{
			int randomNumber = rand.nextInt(20)+1;
			arr1[x]=(x-1)*randomNumber;
			arr2[x]=(x+1)*randomNumber;
			if((x+1)%2==0)
			{
				arr3[x]=arr1[x];
			}else{
				arr3[x]=arr2[x];
			}
			
		}
		System.out.print("arr1 = {");
		for (int i = 0; i < arr1.length; i++) 
			System.out.print(arr1[i]+", ");
		System.out.print("}");
		System.out.println("");
		System.out.print("arr2 = {");
		for (int i = 0; i < arr2.length; i++) 
			System.out.print(arr2[i]+", ");
		System.out.print("}");
		System.out.println("");
		System.out.print("arr3 = {");
		for (int i = 0; i < arr3.length; i++) 
			System.out.print(arr3[i]+", ");
		System.out.print("}");

	}

}
