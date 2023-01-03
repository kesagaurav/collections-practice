import java.util.*;

public class Main {

	public static void main(String[] args) {

		/*
		 * String var = "Today is Thurday"; // String ch[]=var.split("-"); List<String>
		 * list = new ArrayList<>();
		 * 
		 * System.out.println(Arrays.asList(var));
		 */
		int a[]= {0,2,1,5,3,4};
	System.out.println(buildArray(a));
	int b[]= {1,2,3,4};
	System.out.println(runningSum(b));
	int a1[]= {2,5,1,3,4,7};
	int n=3;
	shuffle(a1, n);

		List<String> list2=new ArrayList<>();
		list2.add("Gaurav");
		list2.add("Sushri Sangita");
		list2.add("xyz");
		/*list2.stream().filter(a->{
			if(a.contains("Gaurav") || a.length()%2==0) {
				System.out.printf("\t " + a.length());
				return true;
			}else {
				return false;
			}
		}).forEach(e->System.out.printf( "\t " + e));*/

		list2.stream().forEach(e->{
			if(e.contains("Gaurav") || e.length()%2==0) {
				System.out.printf("\t " + e.length() + " " +  e);
			}
		});
		/*
		 * String a="gau"; System.out.println( " " + Arrays.asList(a));
		 */
	}
	
	public static int[] buildArray(int[] nums) {
		int ans[]=new int[nums.length];
        for(int i=0;i<nums.length-1;i++) {
        	ans[i]=nums[nums[i]];
        	System.out.println(ans[i]);
        }
        return ans;
	};

	
    public static int[] runningSum(int[] nums) {
    	for(int i=1;i<nums.length;i++) {
    		nums[i]+=nums[i-1];
    	}
		return nums;
    }
	    public static void shuffle(int[] nums,int n) {
	    	List<Integer> list=new ArrayList<>();
	    	for(int i=0;i<nums.length;i++) {
	    		list.add(nums[i]);

	    	}
	    	Collections.shuffle(list, new Random(n));
	    	System.out.println(list);
	    	

	    }
	    	

    }
	

