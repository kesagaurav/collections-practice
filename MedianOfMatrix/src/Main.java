
public class Main {

	public static void main(String[] args) {

		int arr[][]={{10, 20, 30},
				   {40,50,60},
				   {70,80,90}};
		matrixMedian(arr);
				
	}

	
	public static void matrixMedian(int a[][]) {
		int b=0;
		int i,j=0;
		for( i=0;i<a.length;i++) {
			for( j=0;j<a.length;j++) {
				b=a[i][j];
			}
			System.out.println(b);
		}
		
		
	}
}
