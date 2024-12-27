//import java.util.*;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		class Result {
//
//		    /*
//		     * Complete the 'hourglassSum' function below.
//		     *
//		     * The function is expected to return an INTEGER.
//		     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
//		     */
//
//		    public static int hourglassSum(List<List<Integer>> arr) {
//		    // Write your code here
//		    int maxSum = Integer.MIN_VALUE;
//		for (int row = 0; row <= 3; row++) {
//		    for (int col = 0; col <= 3; col++) {
//		        int sum = 0;
//		        sum += arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2);
//		        sum += arr.get(row + 1).get(col + 1);
//		        sum += arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
//		        
//		        if (sum > maxSum) {
//		            maxSum = sum;
//		        }
//		    }
//		}
//		return maxSum;
//	
//		    }
//		}
//	
//
//
