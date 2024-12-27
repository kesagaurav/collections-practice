import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;



public class EventManagment {

static List<Guest> guests=new ArrayList<>();
	public static void main(String[] args) {
		EventManagment manager=new EventManagment();

	    List<Guest> guestList=new ArrayList<>();
	    guestList.add(new Guest("gaurav", "19-11-1998", "english", "us","eat"));
	    guestList.add(new Guest("deepa", "10-10-1998", "french", "france","sports"));
	    guestList.add(new Guest("gaurav2", "08-10-1998", "french", "france","sports"));
	    guestList.add(new Guest("deepa1", "9-9-1998", "french", "france","sports"));				
	    guestList.add(new Guest("rama", "19-9-1998", "spanish", "spain","dance"));
	    guestList.add(new Guest("rama1", "18-9-1998", "spanish", "spain","music"));
	    guestList.add(new Guest("sai", "30-8-1998", "german", "germany","sports"));
	    guestList.add(new Guest("shireesh", "12-7-1998", "german", "germany","dance"));
	    guestList.add(new Guest("jingping", "19-06-1998", "chinese", "china","read"));
	    guestList.add(new Guest("jingping2", "1-07-1998", "chinese", "china","read"));
	    guestList.add(new Guest("jingping3", "2-04-1998", "chinese", "china","read"));
		guests.addAll(guestList);
		guestList=EventManagment.populateGuest();
		System.out.println(guests);
		printline();
		EventManagment.filterGuestsOnSpain();
		printline();
		EventManagment.filterGuestsOnFrance();
		printline();
		EventManagment.filterGuestsOnChina();
		
		
	}
	public static List<Guest> populateGuest(){
	   
		return guests;
	}
	
	
	public static void printline() {
		System.out.println("____________________________");
	}
	
	
	public static void filterGuestsOnSpain() {
		guests.stream().filter(a->a.getCountry().contains("spain")).forEach(e->System.out.println(e));
		
	}
	

	public static void filterGuestsOnFrance() {
		guests.stream().filter(a->a.getCountry().contains("france")).forEach(e->System.out.println(e));

	}
	
	
	public static void filterGuestsOnChina() {
		guests.stream().filter(a->a.getCountry().contains("china")).forEach(e->System.out.println(e));

	}
	
	
	
	

}
