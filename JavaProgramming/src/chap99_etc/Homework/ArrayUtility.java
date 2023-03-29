package chap99_etc.Homework;

import java.util.Arrays;

public class ArrayUtility {


	public static double[] intToDouble(int[] source) {
		double[] result = new double[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = source[i];
		}
		return result;
	}

	public static int[] doubleToInt(double[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length; i++) {
			result[i] = (int) source[i];
		}
		return result;
	}

	public static void main(String[] args) {
		    int[] intArray = {1, 2, 3, 5, 7};
	        double[] doubleArray = ArrayUtility.intToDouble(intArray);
	        int[] convertedIntArray = ArrayUtility.doubleToInt(doubleArray);
	        
	        System.out.println("Original int array: " + Arrays.toString(intArray));
	        System.out.println("Converted double array: " + Arrays.toString(doubleArray));
	        System.out.println("Converted int array: " + Arrays.toString(convertedIntArray));
	    }
}
