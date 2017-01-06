import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Your sentence: ");
		String sentence = scan.nextLine();
		char[]letters = sentence.toCharArray();
		char[]newSentence = new char[letters.length];
		System.out.println("");
		int numberOfA=0;
		for (int i = 0; i < letters.length; i++) {
			if(letters[i]!='a' &&letters[i]!='A')
			{
				newSentence[i-numberOfA]=letters[i];
			}else numberOfA++;
		}
		for (int i = 0; i < newSentence.length; i++) {
			System.out.print(newSentence[i]);
		}
		

	}

}
