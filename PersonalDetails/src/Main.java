import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		List<PersonalDetails> personalList=new ArrayList<>();
		personalList.add(new PersonalDetails("gaurav", "9550671038", "KBR RESIDENCY", "506002", "India"));
		personalList.add(new PersonalDetails("deepa", "9849971504", "SHANTINAGAR", "506003", "Usa"));
		personalList.add(new PersonalDetails("omkar", "9441970669", "SURARAM", "506004", "Germany"));
		personalList.add(new PersonalDetails("kesav", "9550671039", "LB NAGAR", "506005", "Italy"));

		System.out.println("\n printing all personal details");
		personalList.forEach(e->System.out.println(e));
		System.out.println("\n printing address for the specific alphabet whether is true or false");
	boolean b=	personalList.stream().anyMatch(a->a.getAddress().contains("S"));
	System.out.println(b);
	System.out.println("\n printing the names with address");
	personalList.stream().filter(a->a.getAddress().contains("SHANTINAGAR")).forEach(e->System.out.println(e));
	System.out.println("prilnting the address with address and pincode");
	Map<String,List<String>> addpin=personalList.stream().collect(Collectors.groupingBy(PersonalDetails::getAddress,Collectors.mapping(PersonalDetails::getPincode,Collectors.toList())));
	System.out.println(addpin);
	System.out.println("prilnting the address with name and contactno");
	Map<String,Set<String>> namecno=personalList.stream().collect(Collectors.groupingBy(PersonalDetails::getName,Collectors.mapping(PersonalDetails::getContactno, Collectors.toSet())));
	System.out.println(namecno);
	}

}
