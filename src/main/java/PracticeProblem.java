public class PracticeProblem {

	public static void main(String args[]) {

	}

	// 1. Create a method called bubbleSortString(String[] strings) which takes in a string array and sorts it in alphabetical order.  Your bubble sort should ignore casing.  return nothing.

	public static void bubbleSortString(String [] strings){
		for (int i = 0; i <strings.length; i++){
			for (int j = 0; j < strings.length-1; j++){
				if (strings[j].compareToIgnoreCase(strings[j+1])>0){
					String temp = strings [j];
					strings [j] = strings [j+1];
					strings [j+1] = temp;
				}
			}
		}
	}
}