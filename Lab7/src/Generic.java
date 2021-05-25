
public class Generic {
	public static < E > void printArray(E[] inputArray) {	
		for (E element : inputArray) {		System.out.printf("%s \t", element);		}
		System.out.println();		}
	
	public static < E > void printReverseArray(E[] inputArray) {
		for (int i = inputArray.length-1; i >= 0; i--) {	System.out.print(inputArray[i]+"\t");	}
		System.out.println();	}
	
	   public static void main(String args[]) {
		      Integer[] intArray = { 065, 100, 200, 300};
		      Double[] doubleArray = { 1.241423, 2.11124, 3.4343, 4.43145};
		      Double[] floatArray = { 4.0, 3.5, 2.7, 1.1};

		      System.out.println("Array integerArray contains:");      printArray(intArray);
		      System.out.println("Reverse Order:");		      printReverseArray(intArray);
		      		      
		      System.out.println("\nArray doubleArray contains:");     printArray(doubleArray);
		      System.out.println("Reverse Order:");		      printReverseArray(doubleArray);

		      System.out.println("\nArray floatArray contains:");      printArray(floatArray);
		      System.out.println("Reverse Order:");		      printReverseArray(floatArray);

	   }
}
