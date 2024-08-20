
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours[]= {72,48,24,3};
		System.out.println(countCompleteDayPairs(hours));

	}

	public static int countCompleteDayPairs(int[] hours) {
		int c=0;
		for(int i=0;i<hours.length;i++) {
			for(int j=i+1;j<hours.length;j++) {
				if((hours[i]+hours[j])%24==0) {
					c++;
				}
			}
		}
		return c;
	}

}
