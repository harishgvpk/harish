package strings_arrays;

public class Array {

	public void largestNumber() {
		int temp = 0;
		int array[] = {23,45,4,16,47,23,67,43};
		for(int i=0 ; i<array.length ; i++) {
			for(int j=i+1 ; j<array.length ;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
				}
			}
		}
		System.out.println("largest number in the array is ==>" +temp);
	}

	public void smallNumber() {
		int temp = 0;
		int array[] = {23,45,4,16,47,23,67,43};
		for(int i=0 ; i<array.length ; i++) {
			for(int j=i+1 ; j<array.length ;j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("small number in the array is ==>" +array[0]);
	}



	public static void main(String[] args) {
		Array array = new Array();
		array.largestNumber();
		array.smallNumber();

	}

}
