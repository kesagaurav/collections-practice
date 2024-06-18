import java.util.*;
public class Main {

	public static void main(String[] args) {

		Map<String,String> languages=new HashMap<>();
		languages.put("java", "highlevel programming language");
		languages.put("python","good for oops");
		languages.put("BASIC", "beginner of all programmers");
		languages.put("C", "basic lanuage for programmers");
		languages.put("html", "basics of web");
		//System.out.println(languages.get("java"));//values will coming
		languages.put("java", "aboyt java");
		//System.out.println(languages.get("java"));
		
		if(languages.containsKey("java")) {
			System.out.println("java is already in map");
		}else {
			languages.put("java", "learing java course");
		}
		
		//languages.remove("C");
		if(languages.remove("C", "basic lanuage for programmers")) {
			System.out.println("C removed");
		}else {
			System.out.println("C not removed");
		}
	System.out.println(languages.replace("C", "basic"));
	
		for (Map.Entry<String, String> entry : languages.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			
		}
		
	}

}
