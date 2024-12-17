//
//public class Main {
//public static void main(String[] args) {
//	int sum1 = h1.stream().mapToInt(Integer::intValue).sum();
//    int sum2 = h2.stream().mapToInt(Integer::intValue).sum();
//    int sum3 = h3.stream().mapToInt(Integer::intValue).sum();
//
//    int i = 0, j = 0, k = 0;
//
//    // Loop until we find equal sums or exhaust one of the stacks
//    while (i < h1.size() && j < h2.size() && k < h3.size()) {
//        // If all three sums are equal, return the sum
//        if (sum1 == sum2 && sum1 == sum3) {
//            return sum1;
//        }
//
//        // Remove the top element from the tallest stack
//        if (sum1 >= sum2 && sum1 >= sum3) {
//            sum1 -= h1.get(i++);
//        } else if (sum2 >= sum1 && sum2 >= sum3) {
//            sum2 -= h2.get(j++);
//        } else if (sum3 >= sum1 && sum3 >= sum2) {
//            sum3 -= h3.get(k++);
//        }
//    }
//
//    return 0;
//	
//	
//	link for gfg comments: https://www.geeksforgeeks.org/problems/count-the-elements1529/1
//}
//}
