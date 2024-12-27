
public class Main {

	public static void main(String[] args) {
		int arr[][]={{100, 20, 30, 40},
			   {15, 25, 35, 45},
			   {27, 29, 35, 45},
			   {32, 33, 39, 50}};
		int x=100;
		System.out.println(matrix(arr, x));
		
		
	}
	
	public static int matrix(int a[][],int x){
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i][j]==x) {
					return x;
				}
			}
		}
		return -1;
	}
	
	
	public static void matrix1(int b[][],int x){
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				while(i==0 && j-1>=0) {
				if(b[i][j]==x) {
					System.out.println("the value of i " + i + " ," + j);
				}else if(b[i][j]<x) {
					i++;
				}else {
					j--;
				}
			}
			}
		}
		System.out.println(-1);
	}
	
	
	
	
	

}
