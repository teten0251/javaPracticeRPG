package act4;

public class MyArray {
	int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public void print() {
		for(int i = 0; i< myArray.length; i++) {
			switch(i) {
			case 1:
				System.out.println("一番目です");
			case 2:
				System.out.println("二番目です");
			default:
				System.out.println("三番目以降です");
			}			
		}
	}
}
