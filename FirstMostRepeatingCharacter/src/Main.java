import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gauravbb";
		int c=0;
		
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					System.out.println(s.charAt(i));
					break;
				}
			}
			if(c==1) {
				System.out.println(s.charAt(i));
				break;
			}
		}
		String s1="a";
		System.out.println(isIsogram(s1));
		int a[]= {1,2,4,5,0};
		int b[]= {2,4,5,0,1};
		System.out.println( " value is -> " + check(a, b));
		Collection<String> abc=new ArrayList<String>();
		abc.add("abc");
		abc.add("def");
		for(String to:abc) {
			System.out.println(to);
		}

	}
	
	static boolean isIsogram(String s) {
		boolean flag=true;
//		for(int i=0;i<s.length();i++) {
//			for(int j=i+1;j<s.length()-1;j++) {
//				if(s.charAt(i)==s.charAt(j)) {
//					flag=false;
//				}
//			}
//		}
		HashMap<Character,Integer> Hash=new HashMap<>();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i)))
				set.add(s.charAt(i));
				flag=false;
				
			
		}
		
//		for(Hash.Entry<Character, Integer> Hash1:Hash.entrySet()) {
//			if(!set.contains(Hash1.getValue())) {
//				flag=false;
//				
//			}
//			System.out.println(Hash1.getKey() + " " + Hash1.getValue());
//		}
//		for(int x:set) {
//			if(x>1) {
//				flag=false;
//			}
//		}
		return flag;
		
		
	}
	
	static boolean check(int a[],int b[]) {
		Arrays.sort(a);
		Arrays.sort(b);
		int c1=0,c2=0;
//		if(a.length!=b.length) {
//			return false;
//		}
		HashMap<Integer,Integer> map=new HashMap<>();
		HashMap<Integer,Integer> map2=new HashMap<>();

//		for(int i=0;i<a.length-1;i++) {
//			
////			for(int j=0;j<b.length-1;j++) {
////				
////				if(a[i]==b[j]) {
////					return true;
////				}
////			}
//			if(a[i]!=b[i]) {
//				return false;
//			}
//		}
		for (int i = 0; i < a.length; i++) {
			map.put(a[i], map.getOrDefault(a[i], 0)+1);
		}
		for(int j=0;j<b.length;j++) {
			map.put(b[j], map.getOrDefault(b[j], 0)-1);
		}
		for(int i=0;i<map.size();i++) {
			if(map.get(i)!=0) {
				return false;
			}
		}
		return true;

	}

}
