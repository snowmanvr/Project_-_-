
public class Task3 {

	public static void main(String[] args) {
		int[] arr1 = {1,5,7,6,8,7,5,6,4,2,8,6};
		int[] arr2 = new int[arr1.length];
		int numberOfSixes=0;
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]!=6){
				arr2[i-numberOfSixes]=arr1[i];
				System.out.println("arr2["+(i-numberOfSixes)+"]= "+arr2[i-numberOfSixes]);
			}else numberOfSixes++;
		}

	}

}
